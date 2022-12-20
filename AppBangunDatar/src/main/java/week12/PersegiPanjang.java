/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week12;

/**
 *
 * @author User
 */
public class PersegiPanjang extends BangunDatar{
    private double panjang;
    private double lebar;

    public PersegiPanjang() {
    }
    
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getLebar() {
        return lebar;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getPanjang() {
        return panjang;
    }

    
    @Override
    double luas() {
       return panjang * lebar;
    }

    @Override
    double keliling() {
        return 2 * (panjang + lebar);
    }
    
}
