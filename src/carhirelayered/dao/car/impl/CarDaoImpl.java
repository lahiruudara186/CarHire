/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhirelayered.dao.car.impl;

import carhirelayered.dao.CrudUtil;
import carhirelayered.dao.car.CarDao;
import carhirelayered.entity.CarEntity;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author udara
 */
public class CarDaoImpl implements CarDao{

//    @Override
//    public Boolean addCar(CarEntity carEntity) throws Exception {
//        return null;
//    }

    @Override
    public boolean add(CarEntity t) throws Exception {
        return CrudUtil.executeUpdate("insert into car_registration(car_number,brand,model,availability) values(?,?,?,?)", 
                t.getRegNo(),
                t.getBrand(),
                t.getModel(),
                t.getAvailability());
    }

    @Override
    public boolean update(CarEntity t) throws Exception {
        return CrudUtil.executeUpdate("update car_registration set brand=?,model=?,availability=? where car_number=?", t.getBrand(),t.getModel(),t.getAvailability(),t.getRegNo());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("delete from car_registration where car_number=?", id);
    }

    @Override
    public CarEntity get(String id) throws Exception {
        ResultSet resultSet= CrudUtil.executeQuery("select * from car_registration where car_number = ?", id);
        while(resultSet.next()){
          CarEntity carEntity = new CarEntity(
                  resultSet.getString(1),
                  resultSet.getString(2),
                  resultSet.getString(3),
                  resultSet.getString(4));
          
          return carEntity;
        }
        return null;
    }

    @Override
    public ArrayList<CarEntity> getAll() throws Exception {
        ArrayList<CarEntity> carEntities = new ArrayList<>();
        ResultSet resultSet =  CrudUtil.executeQuery("select * from car_registration");
        
        while(resultSet.next()){
        CarEntity carEntity = new CarEntity(resultSet.getString("car_number"),
                resultSet.getString("brand"),
                resultSet.getString("model"),
                resultSet.getString("availability"));
        carEntities.add(carEntity);
        }
        return carEntities;
    }
    
}
