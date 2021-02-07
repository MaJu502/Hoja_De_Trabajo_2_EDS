/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Stack.java
* Autor: Marco Jurado 
********************************************************/

import java.util.Scanner;

public class DriverHT2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("\n\n Bienvenido al programa de la calculadora");
        System.out.println("A continuacion ingrese el nombre del archivo que desea abrir: ");
        String Nombre_Archivo = scan.nextLine();
        
        Calcu calculator = new Calcu();

        System.out.print(calculator.decode(Nombre_Archivo));
        
        
    }
}
