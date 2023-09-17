/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhirelayered.service.car.impl;

import carhirelayered.dao.CustomDao;
import carhirelayered.dao.DaoFactory;
import carhirelayered.dto.CarDto;
import carhirelayered.dto.CustomerDto;
import carhirelayered.entity.CustomerEntity;
import carhirelayered.service.car.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author udara
 */
public class CustomerServiceImpl implements CustomerService {

    CustomDao customDao = (CustomDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    @Override
    public String addCustomer(CustomerDto customerDto) throws Exception {
        if (customDao.add(new CustomerEntity(
                customerDto.getCustID(),
                customerDto.getCustName(),
                customerDto.getAddress(),
                customerDto.getMobile()))) {
            return "Successfully added";
        } else {
            return "Failed";
        }

    }

    @Override
    public String editCustomer(CustomerDto customerDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String deleteCustomer(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        ArrayList<CustomerEntity> customerEntities = customDao.getAll();

        for (CustomerEntity customerEntity : customerEntities) {
            CustomerDto customerDto = new CustomerDto(
                    customerEntity.getCustID(),
                    customerEntity.getCustName(),
                    customerEntity.getAddress(),
                    customerEntity.getMobile());
            customerDtos.add(customerDto);
        }
        
        return customerDtos;
    }

}
