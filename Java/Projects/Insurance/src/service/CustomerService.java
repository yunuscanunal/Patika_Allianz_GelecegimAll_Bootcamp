package service;

import model.*;

import java.util.ArrayList;

public class CustomerService {
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
}
