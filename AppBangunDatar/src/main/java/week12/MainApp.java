/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week12;

/**
 *
 * @author alzildan
 */
public class MainApp {
    public static void main(String[] args) {
        Segitiga sg = new Segitiga();
        
        sg.setAlas(4);
        sg.setTinggi(8);
        
        System.out.println("Luas : "+ sg.luas());
        System.out.println("keliling : "+ sg.keliling());
    }
}
