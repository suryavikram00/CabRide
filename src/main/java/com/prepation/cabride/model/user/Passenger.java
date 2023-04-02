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
public class Passenger extends User{
    
    private Car carPreferred;
    
    public Car getCarPreferred() {
        return carPreferred;
    }

    public void setCarPreferred(Car carPreferred) {
        this.carPreferred = carPreferred;
    }
    
    @Override
    public double getAverageRating() {
        double totalRating = 0.0;
        if(super.getTripList() == null || super.getTripList().isEmpty()){
            return totalRating;
        }
        
        for(Trip eachTrip : super.getTripList()){
            totalRating = totalRating + eachTrip.getPassenger().getRatingPerTrip();
        }        
        return totalRating / super.getTripList().size();    
    }
    
}
