/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhirelayered.entity;

/**
 *
 * @author udara
 */
public class CarEntity {
    private String regNo;
    private String brand;
    private String model;
    private String availability;

    public CarEntity() {
    }

    public CarEntity(String regNo, String brand, String model, String availability) {
        this.regNo = regNo;
        this.brand = brand;
        this.model = model;
        this.availability = availability;
    }

    /**
     * @return the regNo
     */
    public String getRegNo() {
        return regNo;
    }

    /**
     * @param regNo the regNo to set
     */
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the availability
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * @param availability the availability to set
     */
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "CarEntity{" + "regNo=" + regNo + ", brand=" + brand + ", model=" + model + ", availability=" + availability + '}';
    }
    
    
}
