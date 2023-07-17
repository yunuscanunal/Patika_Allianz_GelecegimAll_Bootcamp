package service;

import model.Agency;
import model.InsuranceRequest;
import model.Policy;
import model.Vehicle;

public class InsuranceRequestService {
    public InsuranceRequest createInsuranceRequest(Agency agency, Vehicle vehicle, Policy policy) {
        InsuranceRequest insuranceRequest = new InsuranceRequest();
        insuranceRequest.setVehicle(vehicle);
        insuranceRequest.setPolicy(policy);
        return insuranceRequest;
    }
}
