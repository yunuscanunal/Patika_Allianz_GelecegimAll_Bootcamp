package model;

import java.util.ArrayList;

public class Agency {
    private String name;
    private ArrayList<BankAccount> bankAccountList;
    private ArrayList<PaymentMovement> paymentMovementList;
    private ArrayList<InsuranceCompany> insuranceCompanyList;
    private ArrayList<Customer> customerList;

    public Agency(String name) {
        this.name = name;
    }
    public Agency(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    public void setBankAccountList(ArrayList<BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }

    public ArrayList<PaymentMovement> getPaymentMovementList() {
        return paymentMovementList;
    }

    public void setPaymentMovementList(ArrayList<PaymentMovement> paymentMovementList) {
        this.paymentMovementList = paymentMovementList;
    }

    public ArrayList<InsuranceCompany> getInsuranceCompanyList() {
        return insuranceCompanyList;
    }

    public void setInsuranceCompanyList(ArrayList<InsuranceCompany> insuranceCompanyList) {
        this.insuranceCompanyList = insuranceCompanyList;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public String toString() {
        return "Agency{" +
                "name='" + name + '\'' +
                ", bankAccountList=" + bankAccountList +
                ", paymentMovementList=" + paymentMovementList +
                ", insuranceCompanyList=" + insuranceCompanyList +
                ", customerList=" + customerList +
                '}';
    }
}
