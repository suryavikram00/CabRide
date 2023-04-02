/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prepation.cabride.model;

/**
 *
 * @author NMSLAP570
 */
public class Proximity {
    
    private Float xCoordinate;
    
    private Float yCoordinate;

    public Proximity(Float xCoordinate, Float yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public Float getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(Float xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public Float getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(Float yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
    
    
    
}
