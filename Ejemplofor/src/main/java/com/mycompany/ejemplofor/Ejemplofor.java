/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejemplofor;

/**
 *
 * @author Luis Fernando
 */
public class Ejemplofor {

    public void Fomato() {
        int[] numeros = {1, 2, 3, 4, 5};
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        System.out.println("La suma es: " + suma);

    }

    public static void main(String[] args) {
        Ejemplofor formato = new Ejemplofor();
        formato.Fomato();
    }
}