/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prepation.cabride;

import com.prepation.cabride.model.Proximity;
import com.prepation.cabride.model.Trip;
import com.prepation.cabride.model.car.HatchBack;
import com.prepation.cabride.model.car.Sedan;
import com.prepation.cabride.model.car.Suv;
import com.prepation.cabride.model.user.Driver;
import com.prepation.cabride.model.user.Passenger;
import com.prepation.cabride.service.ICabService;
import com.prepation.cabride.service.cabService;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author NMSLAP570
 */
public class DriverClass {
    
    public static void main(String[] args){
        
        List<Trip> tripList = new LinkedList<>(); 
        
        Driver driverOne = new Driver();
        driverOne.setName("d1");
        driverOne.setRatingPerTrip(4);        
        Passenger passengerOne = new Passenger();
        passengerOne.setName("c1");
        passengerOne.setRatingPerTrip(5);        
        tripList.add(new Trip(passengerOne, driverOne));
        
        Driver driverTwo = new Driver();
        driverTwo.setName("d1");
        driverTwo.setRatingPerTrip(5);        
        Passenger passengerTwo = new Passenger();
        passengerTwo.setName("c2");
        passengerTwo.setRatingPerTrip(3);        
        tripList.add(new Trip(passengerTwo, driverTwo));
        
        Driver driverThree = new Driver();
        driverThree.setName("d1");
        driverThree.setRatingPerTrip(1);        
        Passenger passengerThree = new Passenger();
        passengerThree.setName("c3");
        passengerThree.setRatingPerTrip(2);        
        tripList.add(new Trip(passengerThree, driverThree));
        
        
        Driver driverFour = new Driver();
        driverFour.setName("d2");
        driverFour.setRatingPerTrip(5);        
        Passenger passengerFour = new Passenger();
        passengerFour.setName("c1");
        passengerFour.setRatingPerTrip(1);        
        tripList.add(new Trip(passengerFour, driverFour));
        
        
        Driver driverFive = new Driver();
        driverFive.setName("d2");
        driverFive.setRatingPerTrip(5);        
        Passenger passengerFive = new Passenger();
        passengerFive.setName("c2");
        passengerFive.setRatingPerTrip(3);        
        tripList.add(new Trip(passengerFive, driverFive));
        
        Driver driverSix = new Driver();
        driverSix.setName("d2");
        driverSix.setRatingPerTrip(4);        
        Passenger passengerSix = new Passenger();
        passengerSix.setName("c3");
        passengerSix.setRatingPerTrip(5);        
        tripList.add(new Trip(passengerSix, driverSix));
        
        Driver driverSeven = new Driver();
        driverSeven.setName("d3");
        driverSeven.setRatingPerTrip(3);        
        Passenger passengerSeven = new Passenger();
        passengerSeven.setName("c1");
        passengerSeven.setRatingPerTrip(2);        
        tripList.add(new Trip(passengerSeven, driverSeven));
        
        Driver driverEight = new Driver();
        driverEight.setName("d3");
        driverEight.setRatingPerTrip(4);        
        Passenger passengerEight = new Passenger();
        passengerEight.setName("c2");
        passengerEight.setRatingPerTrip(3);        
        tripList.add(new Trip(passengerEight, driverEight));
        
        Driver driverNine = new Driver();
        driverNine.setName("d3");
        driverNine.setRatingPerTrip(3);        
        Passenger passengerNine = new Passenger();
        passengerNine.setName("c3");
        passengerNine.setRatingPerTrip(3);        
        tripList.add(new Trip(passengerNine, driverNine));                
        
        Driver availableDriverOne = new Driver();
        availableDriverOne.setName("d1");
        availableDriverOne.setProximity(new Proximity(1.0F, 0.0F));
        availableDriverOne.setCarAssigned(new HatchBack());
        
        Driver availableDriverTwo = new Driver();
        availableDriverTwo.setName("d2");
        availableDriverTwo.setProximity(new Proximity(2.0F, 0.0F));
        availableDriverTwo.setCarAssigned(new Suv());
        
        Driver availableDriverThree = new Driver();
        availableDriverThree.setName("d3");
        availableDriverThree.setProximity(new Proximity(3.0F, 0.0F));
        availableDriverThree.setCarAssigned(new Sedan());
        
        Driver availableDriverFour = new Driver();
        availableDriverFour.setName("d4");
        availableDriverFour.setProximity(new Proximity(4.0F, 0.0F));
        availableDriverFour.setCarAssigned(new HatchBack());
        
        List<Driver> availbleDriverList = new LinkedList<>();
        availbleDriverList.add(availableDriverOne);
        availbleDriverList.add(availableDriverTwo);
        availbleDriverList.add(availableDriverThree);
        availbleDriverList.add(availableDriverFour);
        
        
        Passenger passenger = new Passenger();
        passenger.setName("c2");
        passenger.setProximity(new Proximity(1.0F, 0.0F));
        passenger.setCarPreferred(new Sedan());
                        
        ICabService cabService = new cabService();
        List<Driver> eligibleDriverList = cabService.getEligibleDriver(passenger, availbleDriverList, tripList);
        
        eligibleDriverList.forEach(eachDriver -> {
            System.out.println("eligible driver | name : " + eachDriver.getName() 
                    + " | average rating :: " + eachDriver.getAverageRating());
        });
        
        
        
    }
    
}
