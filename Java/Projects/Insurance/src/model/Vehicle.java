package model;

import java.util.ArrayList;

public class Vehicle {
    private String brand;
    private String model;
    private String plate;
    private String chassisNumber;
    private int modelYear;
    private ArrayList<Accident> accidentList;
    private ColorTypeEnum color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public ArrayList<Accident> getAccidentList() {
        return accidentList;
    }

    public void setAccidentList(ArrayList<Accident> accidentList) {
        this.accidentList = accidentList;
    }

    public ColorTypeEnum getColor() {
        return color;
    }

    public void setColor(ColorTypeEnum color) {
        this.color = color;
    }
}
