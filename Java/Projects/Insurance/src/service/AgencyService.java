package service;

import model.Agency;
import model.BankAccount;
import model.InsuranceCompany;

import java.util.ArrayList;

public class AgencyService {

    public Agency createAgency(String name) {


        Agency agency = new Agency();
        agency.setName(name);
        return agency;
    }

    public void addBankAccountToAgency(Agency agency, BankAccount bankAccount) {
        if (agency.getBankAccountList() != null) {
            agency.getBankAccountList().add(bankAccount);
        } else {
            ArrayList<BankAccount> bankAccountList = new ArrayList<BankAccount>();
            bankAccountList.add(bankAccount);
            agency.setBankAccountList(bankAccountList);
        }
    }

    public void addInsuranceCompanyToAgency(Agency agency, InsuranceCompany insuranceCompany) {
        if (agency.getInsuranceCompanyList() != null) {
            agency.getInsuranceCompanyList().add(insuranceCompany);

        } else {
            ArrayList<InsuranceCompany> insuranceCompanyList = new ArrayList<InsuranceCompany>();
            insuranceCompanyList.add(insuranceCompany);
            agency.setInsuranceCompanyList(insuranceCompanyList);
        }

    }

}
