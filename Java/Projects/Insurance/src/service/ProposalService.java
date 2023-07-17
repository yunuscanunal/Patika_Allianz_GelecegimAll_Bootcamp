package service;

import model.InsuranceCompany;
import model.Proposal;
import model.Vehicle;

import java.math.BigDecimal;
import java.util.Date;

public class ProposalService {
    public Proposal createProposal(InsuranceCompany company, Vehicle vehicle, BigDecimal offerPrice, Date startDate,
                                   Date endDate, Date expireDate, boolean isApproved, BigDecimal discountPrice){

        Proposal proposal = new Proposal();
        proposal.setCompany(company);
        proposal.setVehicle(vehicle);
        proposal.setOfferPrice(offerPrice);
        proposal.setStartDate(startDate);
        proposal.setEndDate(endDate);
        proposal.setExpireDate(expireDate);
        //proposal.set
        proposal.setDiscountPrice(discountPrice);
        return proposal;
    }
}
