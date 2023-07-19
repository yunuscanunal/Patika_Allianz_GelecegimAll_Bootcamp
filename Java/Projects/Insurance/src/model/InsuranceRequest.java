package model;

import java.util.ArrayList;

public class InsuranceRequest {
    private ArrayList<Proposal> proposalList;
    private Vehicle vehicle;
    private Policy policy;
    private InsuranceTypeEnum insuranceTypeEnum;


    public InsuranceRequest(Vehicle vehicle, Policy policy) {
        this.vehicle = vehicle;
        this.policy = policy;
    }

    public InsuranceRequest() {
    }

    public ArrayList<Proposal> getProposalList() {
        return proposalList;
    }

    public void setProposalList(ArrayList<Proposal> proposalList) {
        this.proposalList = proposalList;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public InsuranceTypeEnum getInsuranceTypeEnum() {
        return insuranceTypeEnum;
    }

    public void setInsuranceTypeEnum(InsuranceTypeEnum insuranceTypeEnum) {
        this.insuranceTypeEnum = insuranceTypeEnum;
    }

    @Override
    public String toString() {
        return "InsuranceRequest{" +
                "proposalList=" + proposalList +
                ", vehicle=" + vehicle +
                ", policy=" + policy +
                '}';
    }
}
