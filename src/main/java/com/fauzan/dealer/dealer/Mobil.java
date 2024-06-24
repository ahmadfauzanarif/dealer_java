/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fauzan.dealer.dealer;

/**
 *
 * @author D-15
 */
public class Mobil {
    private String merek;
    private String model;
    
    public Mobil(String merek, String model) {
        this.merek = merek;
        this.model = model;
    }

    public String getMerek() {
        return merek;
    }

    public String getModel() {
        return model;
    }
    
    public void readMerek() {
        System.out.println("Merek mobil ini adalah" + getMerek());
    }
}
