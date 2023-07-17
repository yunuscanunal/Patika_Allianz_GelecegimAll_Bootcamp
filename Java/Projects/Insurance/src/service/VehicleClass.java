package service;

import model.ColorTypeEnum;
import model.Vehicle;

public class VehicleClass {
    public Vehicle createVehicle (String brand, String model, String plate, String chassisNumber,
                                  int modelYear, ColorTypeEnum color){
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand(brand);
        vehicle.setModel(model);
        vehicle.setPlate(plate);
        vehicle.setChassisNumber(chassisNumber);
        vehicle.setModelYear(modelYear);
        vehicle.setColor(color);
        return vehicle;
    }
}
