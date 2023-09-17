/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhirelayered.service.car.impl;

import carhirelayered.dao.DaoFactory;
import static carhirelayered.dao.DaoFactory.DaoTypes.CAR;
import carhirelayered.dao.car.CarDao;
import carhirelayered.dto.CarDto;
import carhirelayered.entity.CarEntity;
import carhirelayered.service.car.CarService;
import java.util.ArrayList;

/**
 *
 * @author udara
 */
public class CarServiceImpl implements CarService {

    CarDao carDao = (CarDao) DaoFactory.getInstance().getDao(CAR);

    @Override
    public String addCar(CarDto carDto) throws Exception {
        CarEntity carEntity = new CarEntity(carDto.getRegNo(),
                carDto.getBrand(),
                carDto.getModel(),
                carDto.getAvailability());

        if (carDao.add(carEntity)) {
            return "Successfully added";
        } else {
            return "Fail";
        }

    }

    @Override
    public String editCar(CarDto carDto) throws Exception {
        CarEntity carEntity = new CarEntity(carDto.getRegNo(),
                carDto.getBrand(),
                carDto.getModel(),
                carDto.getAvailability());

        if (carDao.update(carEntity)) {
            return "Successfully updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteCar(String id) throws Exception {
        if (carDao.delete(id)) {
            return "Successfully deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public ArrayList<CarDto> getAllCar() throws Exception {
        ArrayList<CarDto> carDtos = new ArrayList<>();
        ArrayList<CarEntity> carEntities = carDao.getAll();

        for (CarEntity carEntity : carEntities) {
            CarDto carDto = new CarDto(carEntity.getRegNo(),
                    carEntity.getBrand(),
                    carEntity.getModel(),
                    carEntity.getAvailability());
            carDtos.add(carDto);
        }

        return carDtos;
    }

    @Override
    public CarDto getCar(String id) throws Exception {
        CarEntity carEntity = carDao.get(id);
        return new CarDto(carEntity.getRegNo(),carEntity.getBrand(),
                    carEntity.getModel(),
                    carEntity.getAvailability());
    }

}
