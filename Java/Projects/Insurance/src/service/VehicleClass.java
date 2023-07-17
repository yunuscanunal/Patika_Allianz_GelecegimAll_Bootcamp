package service;

import model.Accident;
import model.ColorTypeEnum;
import model.Vehicle;

import java.util.ArrayList;

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
    public void AddAccidentToVehicle(Vehicle vehicle, Accident accident){
        if (vehicle.getAccidentList() != null){
            vehicle.getAccidentList().add(accident);
        }else {
            ArrayList<Accident> accidentList = new ArrayList<>();
            accidentList.add(accident);
            vehicle.setAccidentList(accidentList);
        }
    }
}
