/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prepation.cabride.model.user;

import com.prepation.cabride.model.Proximity;
import com.prepation.cabride.model.Trip;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author NMSLAP570
 */
public abstract class User {

    private String name;

    private Integer ratingPerTrip;

    private List<Trip> tripList;

    private Proximity proximity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRatingPerTrip() {
        return ratingPerTrip;
    }

    public void setRatingPerTrip(Integer ratingPerTrip) {
        this.ratingPerTrip = ratingPerTrip;
    }

    public List<Trip> addTrip(Trip trip) {
        if (this.tripList == null) {
            this.tripList = new LinkedList<>();
        }
        this.tripList.add(trip);
        return this.tripList;
    }

        public List<Trip> getTripList() {
        return tripList == null ? new LinkedList<>() : tripList;
    }

    protected void setTripList(List<Trip> tripList) {
        this.tripList = tripList;
    }

    public Proximity getProximity() {
        return proximity;
    }

    public void setProximity(Proximity proximity) {
        this.proximity = proximity;
    }

    public abstract double getAverageRating();

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", ratingPerTrip=" + ratingPerTrip + ", tripList=" + tripList + ", proximity=" + proximity + '}';
    }

}
