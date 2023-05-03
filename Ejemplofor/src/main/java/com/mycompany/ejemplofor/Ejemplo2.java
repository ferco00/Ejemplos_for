/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplofor;

/**
 *
 * @author Luis Fernando
 */
public class Ejemplo2 {
    public void Fomato2() {
       System.out.println("Te digitara los numero del 1 al 10");

        for (int i = 1; i < 11; i++) {
         System.out.println("el numero en que se encuentra es: "+ i);
        }
    }

    public static void main(String[] args) {
        Ejemplo2 formato2 = new Ejemplo2();
        formato2.Fomato2();
    }
}