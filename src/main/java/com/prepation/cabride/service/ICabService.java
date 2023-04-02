/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prepation.cabride.service;

import com.prepation.cabride.model.Trip;
import com.prepation.cabride.model.user.Driver;
import com.prepation.cabride.model.user.Passenger;
import java.util.List;

/**
 *
 * @author NMSLAP570
 */
public interface ICabService {
    
    public List<Driver> getEligibleDriver(Passenger passenger, List<Driver> availbleDriverList, List<Trip> tripList);
                        
    
}
