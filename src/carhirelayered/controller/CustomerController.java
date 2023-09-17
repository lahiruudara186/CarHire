/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhirelayered.controller;

import static carhirelayered.dao.DaoFactory.DaoTypes.CUSTOMER;
import carhirelayered.dto.CarDto;
import carhirelayered.dto.CustomerDto;
import carhirelayered.service.ServiceFactory;
import static carhirelayered.service.ServiceFactory.ServiceType.CAR;
import carhirelayered.service.car.CarService;
import carhirelayered.service.car.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author udara
 */
public class CustomerController {

    CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);

    public String addCustomer(CustomerDto customerDto) throws Exception {
        return customerService.addCustomer(customerDto);
    }

    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
        return customerService.getAllCustomer();
    }

    public String editCustomer(CustomerDto customerDto) throws Exception {
        return customerService.editCustomer(customerDto);
    }

    public String deleteCustomer(String id) throws Exception {
        return customerService.deleteCustomer(id);
    }
}
