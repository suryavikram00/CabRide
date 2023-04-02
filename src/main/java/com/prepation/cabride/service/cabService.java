/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prepation.cabride.service;

import com.prepation.cabride.model.Trip;
import com.prepation.cabride.model.user.Driver;
import com.prepation.cabride.model.user.Passenger;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author NMSLAP570
 */
public class cabService implements ICabService {

    @Override
    public List<Driver> getEligibleDriver(Passenger passenger, List<Driver> availbleDriverList, List<Trip> tripList) {

        // assign the trips specific to the passenger or to the driver
        for (Trip eachTrip : tripList) {
            if (availbleDriverList.contains(eachTrip.getDriver())) {
                availbleDriverList.get(availbleDriverList.indexOf(eachTrip.getDriver())).addTrip(eachTrip);
            }
            if (passenger.equals(eachTrip.getPassenger())) {
                passenger.addTrip(eachTrip);
            }
        }

        // calculate average rating received by passenger
        System.out.println("Average rating of a passenger :: " + passenger.getAverageRating());

        List<Driver> eligibleList = new LinkedList<>();

        // average rating received by the driver
        for (Driver eachDriver : availbleDriverList) {
            System.out.println("Average rating of driver with name :: " + eachDriver.getName()
                    + " | average rating :: " + eachDriver.getAverageRating());
            if (eachDriver.getAverageRating() >= passenger.getAverageRating() 
                    && eachDriver.getCarAssigned().equals(passenger.getCarPreferred())) {
                eligibleList.add(eachDriver);
            }
        }

        /*  If there are no matching drivers available for the criteria #1, then you may
            consider drivers with whom the passenger has rode before but given them rating
            of more than 1. */
        if (eligibleList.isEmpty()) {
            for (Trip eachTrip : passenger.getTripList()) {
                if (eachTrip.getDriver().getRatingPerTrip() > 1
                        && !eligibleList.contains(eachTrip.getDriver())) {
                    eligibleList.add(eachTrip.getDriver());
                }
            }
        }
        
        
        
        return eligibleList;
    }

}
