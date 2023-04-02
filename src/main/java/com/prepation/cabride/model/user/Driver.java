/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prepation.cabride.model.user;

import com.prepation.cabride.model.Trip;
import com.prepation.cabride.model.car.Car;

/**
 *
 * @author NMSLAP570
 */
public class Driver extends User {
    
    private Car carAssigned;

    public Car getCarAssigned() {
        return carAssigned;
    }

    public void setCarAssigned(Car carAssigned) {
        this.carAssigned = carAssigned;
    }
    
    @Override
    public double getAverageRating() {
        double totalRating = 0.0;
        if(super.getTripList() == null || super.getTripList().isEmpty()){
            return totalRating;
        }
        
        for(Trip eachTrip : super.getTripList()){
            totalRating = totalRating + eachTrip.getDriver().getRatingPerTrip();
        }        
        return totalRating / super.getTripList().size();    
    }
    
    
    
}
