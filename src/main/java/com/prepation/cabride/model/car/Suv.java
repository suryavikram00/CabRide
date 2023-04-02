/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prepation.cabride.model.car;

/**
 *
 * @author NMSLAP570
 */
public class Suv extends Car {

    private static final Integer FAIR = 20;

    @Override
    public Integer getFare() {
        return FAIR;
    }
}
