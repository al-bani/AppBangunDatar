/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week12;

/**
 *
 * @author User
 */
public class Segitiga extends BangunDatar{
    
    private double alas;
    private double tinggi;

    public Segitiga() {
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getAlas() {
        return alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }
    
    @Override
    double luas() {
        return  0.5*alas * tinggi;
    }

    @Override
    double keliling() {
        return 3 * alas;
    }
    
}
