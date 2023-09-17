/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhirelayered.controller;

import carhirelayered.dto.CarDto;
import carhirelayered.service.ServiceFactory;
import static carhirelayered.service.ServiceFactory.ServiceType.CAR;
import carhirelayered.service.car.CarService;
import java.util.ArrayList;

/**
 *
 * @author udara
 */
public class CarControllor {
    
    CarService carService = (CarService) ServiceFactory.getInstance().getService(CAR);

    public String addCar(CarDto carDto) throws Exception {
        return carService.addCar(carDto);
    }
    
    public ArrayList<CarDto> getAllCars() throws Exception {
        return carService.getAllCar();
    }
    
    public String editCar(CarDto carDto) throws Exception {
        return carService.editCar(carDto);
    }
    
    public String deleteCar(String id) throws Exception {
        return carService.deleteCar(id);
    }
    
    //
     public CarDto getCar(String id) throws Exception {
        return carService.getCar(id);
    }
    
}
