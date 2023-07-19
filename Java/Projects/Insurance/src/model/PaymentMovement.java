package model;

import java.math.BigDecimal;

public class PaymentMovement {

    private BankAccount bankAccount;
    private String description;
    private MovementTypeEnum movementTypeEnum;
    private BigDecimal amount;

    public PaymentMovement() {
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MovementTypeEnum getMovementTypeEnum() {
        return movementTypeEnum;
    }

    public void setMovementTypeEnum(MovementTypeEnum movementTypeEnum) {
        this.movementTypeEnum = movementTypeEnum;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PaymentMovement{" +
                "bankAccount=" + bankAccount +
                ", description='" + description + '\'' +
                ", movementTypeEnum=" + movementTypeEnum +
                ", amount=" + amount +
                '}';
    }
}
