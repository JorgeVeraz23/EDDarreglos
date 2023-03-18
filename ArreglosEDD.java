/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

/**
 *
 * @author USER
 */

import java.util.Arrays;
import javax.swing.JOptionPane;
public class ArreglosEDD {
    public static void main(String[] args){
        int numeros[] = new int[5];
        int numerotes[] = new int[numeros.length];
        String palabras[] = new String[5];
        int i;
        
        //Ingresando datos con el arreglo
        for(i = 0; i <5;i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento del indice"+ i));
        }
        //Mostrando los datos como los ingresamos
        System.out.println("Los datos sin ordenar son: ");
        for(i = 0; i <5;i++){
            System.out.println("["+ numeros[i]+"]");
        }
        System.out.println("Los datos ordenados son: ");
        //Ordenar arreglo
        Arrays.sort(numeros);//aqui ordenamos al arreglo numeros
        for(i = 0; i<5;i++) {
            System.out.println("["+numeros[i]+"]");
        }
        //Rellenando al arreglo palabras
        Arrays.fill(palabras, "Bienvenido a la fiesta");//aqui rellenamos cada uno de los 5 espacios del arreglo con el texto bienvenido a la fiesta
        System.out.println("Elementos del arreglo palabras");
        for(i = 0; i<5;i++){
            System.out.println("["+palabras[i]+"]");
        }
        //Copiando los elementos del arreglo numeros a numerotes
        System.arraycopy(numeros, 0, numerotes, 0, numeros.length);
        System.out.println("Elementos del arreglo numerotes: ");
        for(i = 0; i<5;i++){
            System.out.println("["+numerotes[i]+"]");
        }
    }   
}
