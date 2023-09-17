/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhirelayered.dto;

/**
 *
 * @author udara
 */
public class CustomerDto {
     private String custID;
    private String custName;
    private String address;
    private String mobile;

    public CustomerDto() {
    }

    public CustomerDto(String custID, String custName, String address, String mobile) {
        this.custID = custID;
        this.custName = custName;
        this.address = address;
        this.mobile = mobile;
    }

    /**
     * @return the custID
     */
    public String getCustID() {
        return custID;
    }

    /**
     * @param custID the custID to set
     */
    public void setCustID(String custID) {
        this.custID = custID;
    }

    /**
     * @return the custName
     */
    public String getCustName() {
        return custName;
    }

    /**
     * @param custName the custName to set
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "CustomerDto{" + "custID=" + custID + ", custName=" + custName + ", address=" + address + ", mobile=" + mobile + '}';
    }
    
    
}
