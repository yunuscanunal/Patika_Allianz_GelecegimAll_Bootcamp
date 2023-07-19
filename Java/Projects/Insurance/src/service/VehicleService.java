package service;

import model.Accident;
import model.ColorTypeEnum;
import model.Vehicle;

import java.math.BigDecimal;
import java.util.ArrayList;

public class VehicleService {
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
    public void addAccidentToVehicle(Vehicle vehicle, Accident accident){
        if (vehicle.getAccidentList() != null){
            vehicle.getAccidentList().add(accident);
        }else {
            ArrayList<Accident> accidentList = new ArrayList<>();
            accidentList.add(accident);
            vehicle.setAccidentList(accidentList);
        }
    }
    public BigDecimal getTotalDamageOfTheVehicle(Vehicle vehicle){
        BigDecimal totalDamageOfTheVehicle = BigDecimal.ZERO;
        if(vehicle.getAccidentList() == null){
            vehicle.setAccidentList(new ArrayList<>());
        }
        for(Accident accident : vehicle.getAccidentList()){
            totalDamageOfTheVehicle = totalDamageOfTheVehicle.add(accident.getDamagePrice());
        }
        return totalDamageOfTheVehicle;
    }
}
