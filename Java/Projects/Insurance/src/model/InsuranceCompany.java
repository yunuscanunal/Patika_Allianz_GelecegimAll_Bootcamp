package model;

import java.math.BigDecimal;
import java.util.ArrayList;

public class InsuranceCompany {
    private String name;
    private String taxOffice;
    private String taxNumber;
    private String address;
    private BigDecimal commission;
    private ArrayList<Insurance> insuranceList;
    private ArrayList<BankAccount> bankAccountList;
    private ArrayList<PaymentMovement> paymentMovementList;

    public InsuranceCompany(String name, String taxOffice, String taxNumber, String address, BigDecimal commission) {
        this.name = name;
        this.taxOffice = taxOffice;
        this.taxNumber = taxNumber;
        this.address = address;
        this.commission = commission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxOffice() {
        return taxOffice;
    }

    public void setTaxOffice(String taxOffice) {
        this.taxOffice = taxOffice;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(ArrayList<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
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

    @Override
    public String toString() {
        return "InsuranceCompany{" +
                "name='" + name + '\'' +
                ", taxOffice='" + taxOffice + '\'' +
                ", taxNumber='" + taxNumber + '\'' +
                ", address='" + address + '\'' +
                ", commission=" + commission +
                ", insuranceList=" + insuranceList +
                ", bankAccountList=" + bankAccountList +
                ", paymentMovementList=" + paymentMovementList +
                '}';
    }
}
