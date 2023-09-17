/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhirelayered.dao.car.impl;

import carhirelayered.dao.CrudUtil;
import carhirelayered.dao.CustomDao;
import carhirelayered.entity.CustomerEntity;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author udara
 */
public class CustomerDaoImpl implements CustomDao {

    @Override
    public boolean add(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("insert into customer(cust_id,name,address,mobile) values(?,?,?,?)",
                t.getCustID(),
                t.getCustName(),
                t.getAddress(),
                t.getMobile());
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
        ArrayList<CustomerEntity> customerEntities = new ArrayList<>();
        ResultSet resultSet = CrudUtil.executeQuery("select * from customer");
        while (resultSet.next()) {
//            CustomerEntity itemEntity = new CustomerEntity(
//                    resultSet.getString(1),
//                    resultSet.getString(2),
//                    resultSet.getString(3),
//                    resultSet.getString(4));

 CustomerEntity itemEntity = new CustomerEntity(
                    resultSet.getString("cust_id"),
                    resultSet.getString("name"),
                    resultSet.getString("address"),
                    resultSet.getString("mobile"));
            customerEntities.add(itemEntity); 

        }
        return customerEntities;
    }

}
