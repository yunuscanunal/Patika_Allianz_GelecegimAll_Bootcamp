package model;

import java.math.BigDecimal;
import java.util.Date;

public class Accident {
    private Date accidentDate;
    private String description;
    private BigDecimal damagePrice;
    private int failureRate;

    public Accident(Date accidentDate, String description, BigDecimal damagePrice, int failureRate) {
        this.accidentDate = accidentDate;
        this.description = description;
        this.damagePrice = damagePrice;
        this.failureRate = failureRate;
    }

    public Date getAccidentDate() {
        return accidentDate;
    }

    public void setAccidentDate(Date accidentDate) {
        this.accidentDate = accidentDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getDamagePrice() {
        return damagePrice;
    }

    public void setDamagePrice(BigDecimal damagePrice) {
        this.damagePrice = damagePrice;
    }

    public int getFailureRate() {
        return failureRate;
    }

    public void setFailureRate(int failureRate) {
        this.failureRate = failureRate;
    }
}
