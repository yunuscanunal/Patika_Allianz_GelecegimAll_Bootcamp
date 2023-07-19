package service;

import model.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    ProposalService proposalService = new ProposalService();
    AgencyService agencyService = new AgencyService();
    PaymentMovementService paymentMovementService = new PaymentMovementService();
    PolicyService policyService = new PolicyService();
    InsuranceCompanyService insuranceCompanyService = new InsuranceCompanyService();

    public Customer createCustomer(String name, CustomerTypeEnum customerTypeEnum) {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setCustomerTypeEnum(customerTypeEnum);

        return customer;
    }

    public void addBankAccountToCustomer(Customer customer, BankAccount bankAccount) {
        if (customer.getBankAccountList() != null) {
            customer.getBankAccountList().add(bankAccount);
        } else {
            ArrayList<BankAccount> bankAccountList = new ArrayList<>();
            bankAccountList.add(bankAccount);
            customer.setBankAccountList(bankAccountList);
        }
    }

    public void addInsuranceRequestToCustomer(Customer customer, InsuranceRequest insuranceRequest) {
        if (customer.getInsuranceRequestList() != null) {
            customer.getInsuranceRequestList().add(insuranceRequest);
        } else {
            ArrayList<InsuranceRequest> insuranceRequestList = new ArrayList<>();
            insuranceRequestList.add(insuranceRequest);
            customer.setInsuranceRequestList(insuranceRequestList);
        }

    }

    public void addPolicyToCustomer(Customer customer, Policy policy) {
        if (customer.getPolicyList() != null) {
            customer.getPolicyList().add(policy);
        } else {
            ArrayList<Policy> policyList = new ArrayList<>();
            policyList.add(policy);
            customer.setPolicyList(policyList);
        }
    }

    public void addPaymentMovementToCustomer(Customer customer, PaymentMovement paymentMovement) {
        if (customer.getPaymentMovementList() != null) {
            customer.getPaymentMovementList().add(paymentMovement);
        } else {
            ArrayList<PaymentMovement> paymentMovementList = new ArrayList<>();
            paymentMovementList.add(paymentMovement);
            customer.setPaymentMovementList(paymentMovementList);
        }
    }

    public void addVehicleToCustomer(Customer customer, Vehicle vehicle) {
        if (customer.getVehicleList() != null) {
            customer.getVehicleList().add(vehicle);
        } else {
            ArrayList<Vehicle> vehicleList = new ArrayList<>();
            vehicleList.add(vehicle);
            customer.setVehicleList(vehicleList);
        }
    }

    public BankAccount checkBankAccount(Customer customer, BigDecimal amount) {
        List<BankAccount> bankAccountList = customer.getBankAccountList();
        for (BankAccount bankAccount : bankAccountList) {
            if (bankAccount.getAmount().compareTo(amount) >= 0) {
                return bankAccount;
            }
        }
        return null;
    }

    public void acceptProposal(Customer customer,
                               Proposal proposal,
                               InsuranceRequest insuranceRequest,
                               Agency agency,
                               InsuranceCompany insuranceCompany) {

        List<InsuranceRequest> insuranceRequestList = customer.getInsuranceRequestList();
        for (InsuranceRequest insuranceRequest1 : insuranceRequestList) {
            if (insuranceRequest1.equals(insuranceRequest)) {
                for (Proposal proposal1 : insuranceRequest1.getProposalList()) {
                    if (proposal1.equals(proposal)) {
                        BankAccount bankAccountCustomer = checkBankAccount(customer, proposalService.calculateDiscountedPrice(proposal));
                        if (bankAccountCustomer != null) {
                            System.out.println("Not have enough money for insurance.");
                            BigDecimal discountedPrice = proposalService.calculateDiscountedPrice(proposal);
                            BigDecimal currentBalance = bankAccountCustomer.getAmount();

                            if (currentBalance.compareTo(discountedPrice) >= 0) {
                                if ((agency.getBankAccountList() != null) && !(agency.getBankAccountList().isEmpty())) {

                                    BankAccount agencyBankAccount = agency.getBankAccountList().get(0);
                                    bankAccountCustomer.setAmount(currentBalance.subtract(discountedPrice));
                                    agencyBankAccount.setAmount(agencyBankAccount.getAmount().add(discountedPrice));

                                    if (insuranceCompany.getBankAccountList() != null && !insuranceCompany.getBankAccountList().isEmpty()) {
                                        BigDecimal commissionAmount = discountedPrice.multiply(insuranceCompany.getCommission());

                                        BankAccount insuranceCompanyBankAccount = insuranceCompany.getBankAccountList().get(0);
                                        agencyBankAccount.setAmount(agencyBankAccount.getAmount().subtract(discountedPrice));
                                        insuranceCompanyBankAccount.setAmount(insuranceCompanyBankAccount.getAmount().add(discountedPrice));
                                        insuranceCompanyBankAccount.setAmount(insuranceCompanyBankAccount.getAmount().subtract(commissionAmount));
                                        agencyBankAccount.setAmount(agencyBankAccount.getAmount().add(commissionAmount));

                                        PaymentMovement customerOutgoingPayment = paymentMovementService.createPaymentMovement(bankAccountCustomer,
                                                "Insurance Payment", MovementTypeEnum.OUTCOME, discountedPrice);
                                        PaymentMovement agencyIncomingPayment = paymentMovementService.createPaymentMovement(agencyBankAccount,
                                                "Insurance Payment", MovementTypeEnum.INCOME, discountedPrice);
                                        PaymentMovement agencyOutgoingPayment = paymentMovementService.createPaymentMovement(agencyBankAccount,
                                                "Insurance Payment", MovementTypeEnum.OUTCOME, discountedPrice);
                                        PaymentMovement insuranceCompanyIncomingPayment = paymentMovementService.
                                                createPaymentMovement(insuranceCompanyBankAccount, "Insurance payment",
                                                        MovementTypeEnum.INCOME, discountedPrice);
                                        PaymentMovement insuranceCompanyOutgoingPayment = paymentMovementService.createPaymentMovement(insuranceCompanyBankAccount,
                                                "Comission Payment", MovementTypeEnum.OUTCOME, commissionAmount);
                                        PaymentMovement agencyCommissionPayment = paymentMovementService.createPaymentMovement(agencyBankAccount,
                                                "Commission Payment", MovementTypeEnum.INCOME, commissionAmount);

                                        addPaymentMovementToCustomer(customer, customerOutgoingPayment);
                                        agencyService.addPaymentMovementToAgency(agencyIncomingPayment, agency);
                                        agencyService.addPaymentMovementToAgency(agencyOutgoingPayment, agency);
                                        insuranceCompanyService.addPaymentMovementToCompany(insuranceCompany, insuranceCompanyIncomingPayment);
                                        insuranceCompanyService.addPaymentMovementToCompany(insuranceCompany, insuranceCompanyOutgoingPayment);
                                        agencyService.addPaymentMovementToAgency(agencyCommissionPayment, agency);

                                        System.out.println(customer.getPaymentMovementList());
                                        System.out.println(agency.getPaymentMovementList());
                                        System.out.println(insuranceCompany.getPaymentMovementList());

                                        proposal1.setApproved(true);
                                        System.out.println("İşlem başarılı. Sigorta işleminiz yapılmıştır.");

                                        Policy policy = policyService.createPolicy(proposal.getCompany(),
                                                proposal.getVehicle(), discountedPrice, proposal.getStartDate(),
                                                proposal.getEndDate());

                                        addPolicyToCustomer(customer, policy);

                                        System.out.println(proposal.getVehicle().getPlate() + " plakası için " + proposal.getCompany().getName()
                                                + " şirketinden " + discountedPrice + " TL karşılığında poliçe alındı.");
                                        System.out.println("Poliçe başlangıç tarihi: " + proposal.getStartDate());
                                        System.out.println("Poliçe bitiş tarihi: " + proposal.getEndDate());
                                    }

                                } else {
                                    System.out.println("İşlem geçersiz oldu, acentanın bir banka hesabına ihtiyacı var.");
                                }
                            }
                        } else {
                            System.err.println("Müşterinin banka hesabı yeterli bakiyeye sahip değil.");
                        }
                    }
                }
            }
        }
    }
}