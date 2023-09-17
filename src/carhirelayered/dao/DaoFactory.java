/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhirelayered.dao;

import carhirelayered.dao.car.impl.CarDaoImpl;
import carhirelayered.dao.car.impl.CustomerDaoImpl;

/**
 *
 * @author udara
 */
public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDao getDao(DaoTypes daoTypes) {
        switch (daoTypes) {
            case CAR:
                return new CarDaoImpl();
                case CUSTOMER:
                return new CustomerDaoImpl();
            default:
                return null;
        }
    }

    public enum DaoTypes {
        CAR,CUSTOMER
    }
}
