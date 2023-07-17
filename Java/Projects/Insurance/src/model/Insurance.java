package model;

public class Insurance {
    private InsuranceTypeEnum insuranceTypeEnum;
    private String name;

    public Insurance(InsuranceTypeEnum insuranceTypeEnum, String name) {
        this.insuranceTypeEnum = insuranceTypeEnum;
        this.name = name;
    }

    public InsuranceTypeEnum getInsuranceTypeEnum() {
        return insuranceTypeEnum;
    }

    public void setInsuranceTypeEnum(InsuranceTypeEnum insuranceTypeEnum) {
        this.insuranceTypeEnum = insuranceTypeEnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
