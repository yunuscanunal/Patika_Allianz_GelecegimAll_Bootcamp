package service;

import model.*;

import java.math.BigDecimal;

public class PaymentMovementService {
    /*
    private BankAccount bankAccount;
    private String description;
    private MovementType movementType;
    private BigDecimal amount;
     */

    public PaymentMovement createPaymentMovement(BankAccount bankAccount, String description,
                                                        MovementTypeEnum movementTypeEnum, BigDecimal amount) {
        PaymentMovement paymentMovement = new PaymentMovement();
        paymentMovement.setBankAccount(bankAccount);
        paymentMovement.setDescription(description);
        paymentMovement.setMovementTypeEnum(movementTypeEnum);
        paymentMovement.setAmount(amount);

        return paymentMovement;
    }

    public String createDescription(InsuranceRequest insuranceRequest) {
        return insuranceRequest.getVehicle().getPlate() + " " + insuranceRequest.getInsuranceTypeEnum().toString() + " payment";
    }
}
