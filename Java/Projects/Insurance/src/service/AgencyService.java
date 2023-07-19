package service;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class AgencyService {

    public Agency createAgency(String name){
        Agency agency = new Agency();
        agency.setName(name);
        return  agency;
    }
    public void addBankAccountToAgency(Agency agency, BankAccount bankAccount){
        if(agency.getBankAccountList() != null){
            agency.getBankAccountList().add(bankAccount);
        } else {
            ArrayList<BankAccount> bankAccountList = new ArrayList<>();
            bankAccountList.add(bankAccount);
            agency.setBankAccountList(bankAccountList);
        }
    }
    public void addInsuranceCompanyToAgency(Agency agency, InsuranceCompany insuranceCompany){
        if(agency.getInsuranceCompanyList() != null){
            agency.getInsuranceCompanyList().add(insuranceCompany);
        } else {
            ArrayList<InsuranceCompany> insuranceCompanyList = new ArrayList<>();
            insuranceCompanyList.add(insuranceCompany);
            agency.setInsuranceCompanyList(insuranceCompanyList);
        }
    }
    public void addCustomerToAgency(Customer customer, Agency agency){
        if(agency.getCustomerList() != null){
            agency.getCustomerList().add(customer);
        } else {
            ArrayList<Customer> customerList = new ArrayList<>();
            customerList.add(customer);
            agency.setCustomerList(customerList);
        }
    }
    public void addPaymentMovementToAgency(PaymentMovement paymentMovement, Agency agency){
        if(agency.getPaymentMovementList() != null){
            agency.getPaymentMovementList().add(paymentMovement);
        } else {
            ArrayList<PaymentMovement> paymentMovementList = new ArrayList<>();
            paymentMovementList.add(paymentMovement);
            agency.setPaymentMovementList(paymentMovementList);
        }
    }
}