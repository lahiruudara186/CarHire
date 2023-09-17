/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhirelayered.service;

import carhirelayered.service.car.impl.CarServiceImpl;
import carhirelayered.service.car.impl.CustomerServiceImpl;

/**
 *
 * @author udara
 */
public class ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }
    
    public SuperService getService(ServiceType serviceType){
      switch (serviceType){
          case CAR:
              return new CarServiceImpl();
            case CUSTOMER:
              return new CustomerServiceImpl();  
          default:
              return null;
      }
    }

    public enum ServiceType {
        CAR, CUSTOMER
    }
}
