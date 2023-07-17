package service;

import model.BankAccount;
import model.DanceCourse;

import java.math.BigDecimal;

public class BankAccountService {

    public BankAccount createBankAccount(String bankName, String companyName, String iban, BigDecimal amount) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBankName(bankName);
        bankAccount.setCompanyName(companyName);
        bankAccount.setIbanNo(iban);
        bankAccount.setAmount(amount);
        return bankAccount;
    }


    public BankAccount getBankAccountWithEnoughMoney(DanceCourse danceCourse, BigDecimal amount) {

        for (BankAccount bankAccount : danceCourse.getBankAccountList()) {
            if (bankAccount.getAmount().compareTo(amount) >= 0) {
                return bankAccount;
            }
        }
        return null;
    }


}
