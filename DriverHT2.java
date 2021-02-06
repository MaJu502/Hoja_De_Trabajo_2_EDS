/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Stack.java
* Autor: Marco Jurado 
********************************************************/

import java.util.Scanner;
import java.util.FileNotFoundException;
import java.io.File;

import org.graalvm.compiler.asm.aarch64.AArch64Assembler.SystemHint;
public class DriverHT2 {
    public static void main(String[] args){

        Calcu Calc = new Calcu();

        //--------------------------------------------------------- Abrir archivo --------------------------------------------------------
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido al programa de la calculadora!");

        try{

            // Scanner que va a buscar el archivo. De no encontrarlo se muestra el mensaje de no existe. 

            System.out.println("Ingrese el nombre del archivo que desea abrir para operar:  ");
            String Nombre_Archivo = "datos.txt";
            scan = new Scanner(new File(Nombre_Archivo));


        }catch(FileNotFoundException excep){
            System.out.println("El archivo que deseas abrir no existe! Por favor intenta nuevamente.");
        }

        //Ahora guarda la info del archivo en el Stack

        Stack<String> l = new Stack<String>();
        scan.useDelimiter("\n");

        //Debera de leer mientras el archivo no tengas nuevas lineas
        while((scan.hasNextLine())){
            String dato = scan.next();
            l.push(dato);
        }

        /** Ahora que las lineas fueron guardadas en un stack toca separar 
         *  para obtener los datos dentro de esa linea */

        //------------------------------------------------------------------------------------------------------------------------------

        Calc.decode(Nombre_Archivo);
        
        
    }
}
