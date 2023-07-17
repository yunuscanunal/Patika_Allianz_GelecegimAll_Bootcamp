package model;

import java.math.BigDecimal;
import java.util.Date;

public class Policy {
    private InsuranceCompany insuranceCompany;
    private Vehicle vehicle;
    private BigDecimal price;
    private Date startDate;
    private Date endDate;

    public Policy(InsuranceCompany insuranceCompany, Vehicle vehicle, BigDecimal price, Date startDate, Date endDate) {
        this.insuranceCompany = insuranceCompany;
        this.vehicle = vehicle;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public InsuranceCompany getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(InsuranceCompany insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
