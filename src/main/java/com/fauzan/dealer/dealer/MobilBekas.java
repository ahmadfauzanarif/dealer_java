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
public class MobilBekas extends Mobil implements Kendaraan {
    private int tahun;
    private double harga;
    
    public MobilBekas(String merek, String model, int tahun, double harga) {
        super(merek, model);
        this.tahun = tahun;
        this.harga = harga;
    }
    
    public int getTahun() {
        return tahun;
    }
    
    public double getHarga() {
        return harga;
    }
    
    // ini adalah notation yang menunjukkan implementasi
    // dari metode info() yang dideklarasikan di interface
    @Override
    public void info() {
        System.out.println("Mobil Bekas: " + getMerek() + " " + getModel() + " (" + tahun + ")");
    }
}
