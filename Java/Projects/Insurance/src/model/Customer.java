package model;

import java.util.ArrayList;

public class Customer {
    private String name;
    private CustomerTypeEnum customerTypeEnum;
    private ArrayList<BankAccount> bankAccountList;
    private ArrayList<InsuranceRequest> insuranceRequestList;
    private ArrayList<Policy> policyList;
    private ArrayList<PaymentMovement> paymentMovementList;
    private ArrayList<Vehicle> vehicleList;

    public Customer() {
    }

    public Customer(String name, CustomerTypeEnum customerTypeEnum) {
        this.name = name;
        this.customerTypeEnum = customerTypeEnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerTypeEnum getCustomerTypeEnum() {
        return customerTypeEnum;
    }

    public void setCustomerTypeEnum(CustomerTypeEnum customerTypeEnum) {
        this.customerTypeEnum = customerTypeEnum;
    }

    public ArrayList<BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    public void setBankAccountList(ArrayList<BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }

    public ArrayList<InsuranceRequest> getInsuranceRequestList() {
        return insuranceRequestList;
    }

    public void setInsuranceRequestList(ArrayList<InsuranceRequest> insuranceRequestList) {
        this.insuranceRequestList = insuranceRequestList;
    }

    public ArrayList<Policy> getPolicyList() {
        return policyList;
    }

    public void setPolicyList(ArrayList<Policy> policyList) {
        this.policyList = policyList;
    }

    public ArrayList<PaymentMovement> getPaymentMovementList() {
        return paymentMovementList;
    }

    public void setPaymentMovementList(ArrayList<PaymentMovement> paymentMovementList) {
        this.paymentMovementList = paymentMovementList;
    }

    public ArrayList<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(ArrayList<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
}
