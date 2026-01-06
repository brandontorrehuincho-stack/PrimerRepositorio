/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumaprincipal;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class SumaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear un objeto Scanner para obtener los numeros del usuario
        Scanner scaner = new Scanner(System.in);
        
        //Pedir al usuario que ingrese el primer numero
        System.out.print("Ingrese el primer numero: ");
        double nume1 = scaner.nextDouble();
        
        //Pedir al usuario que ingrese el segundo numero
        System.out.print("Ingrese el segundo numero: ");
        double nume2 = scaner.nextDouble();
        
        //Crear objeto Numero con los valores
        Numero objn1 = new Numero(nume1);
        Numero objn2 = new Numero(nume2);
        
        //Crear objetoSuma con los numero
        Suma objsuma = new Suma(objn1, objn2);
        
        //Realiza la suma y muestra resultados
        double resul = objsuma.Sumar();
        System.out.println("La suma es: " + resul);
        
        scaner.close();
    }
    
}