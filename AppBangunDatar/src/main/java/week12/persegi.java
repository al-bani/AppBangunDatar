/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week12;

/**
 *
 * @author alzildan
 */
public class persegi extends BangunDatar {
    private double sisi;

    public persegi() {
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double luas() {
        return sisi*sisi;
    }

    @Override
    double keliling() {
        return 4*sisi;
    }
    
}
