/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week12;

/**
 *
 * @author alzildan
 */

abstract class BangunDatar {
    private String namaBangunDatar;

    public BangunDatar() {
        
    }

    public String getNamaBangunDatar() {
        return namaBangunDatar;
    }

    public void setNamaBangunDatar(String namaBangunDatar) {
        this.namaBangunDatar = namaBangunDatar;
    }
    
    abstract double luas();
    abstract double keliling();
}
