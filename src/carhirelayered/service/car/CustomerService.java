/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carhirelayered.service.car;

import carhirelayered.dto.CarDto;
import carhirelayered.dto.CustomerDto;
import carhirelayered.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author udara
 */
public interface CustomerService extends SuperService{
     String addCustomer(CustomerDto customerDto) throws Exception;

    String editCustomer(CustomerDto customerDto) throws Exception;

    String deleteCustomer(String id) throws Exception;

    ArrayList<CustomerDto> getAllCustomer() throws Exception;
}
