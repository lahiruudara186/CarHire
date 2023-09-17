/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carhirelayered.service.car;

import carhirelayered.dao.car.CarDao;
import carhirelayered.dto.CarDto;
import carhirelayered.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author udara
 */
public interface CarService extends SuperService {

    String addCar(CarDto carDto) throws Exception;

    String editCar(CarDto carDto) throws Exception;

    String deleteCar(String id) throws Exception;

//    ArrayList<CarDao> getCar(String id) throws Exception;
     CarDto getCar(String id) throws Exception;

    ArrayList<CarDto> getAllCar() throws Exception;
}
