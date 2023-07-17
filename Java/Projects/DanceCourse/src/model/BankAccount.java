package model;

import java.math.BigDecimal;

public class BankAccount {
    private String bankName;
    private String ibanNo;
    private String companyName;
    private BigDecimal amount;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIbanNo() {
        return ibanNo;
    }

    public void setIbanNo(String ibanNo) {
        this.ibanNo = ibanNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "bankName='" + bankName + '\'' +
                ", ibanNo='" + ibanNo + '\'' +
                ", companyName='" + companyName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
