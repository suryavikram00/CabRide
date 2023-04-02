/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prepation.cabride.model;

import com.prepation.cabride.model.car.Car;
import com.prepation.cabride.model.user.Driver;
import com.prepation.cabride.model.user.Passenger;
import java.util.List;

/**
 *
 * @author NMSLAP570
 */
public class Trip {
    
    private Passenger passenger;
    
    private Driver driver;
    
    

    public Trip(Passenger passenger, Driver driver) {
        this.passenger = passenger;
        this.driver = driver;
    }
    
    
    
//    private List<Driver> eligibleDriverList;

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
   
    
    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }               
}
