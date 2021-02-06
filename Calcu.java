/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Stack.java
* Autor: Marco Jurado 
*
********************************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.SystemPropertiesWriter;

public class Calcu implements calculadora{

    //-------------------------------------------------Atributos--------------------------------------

    int numerox; 
    int numeroy; 
    int resultadoxy; 
    String elemento_pila;

    //-------------------------------------------------Metodos----------------------------------------
 
    /**
    * @author Marco Jurado 
    * @param int x
    * @param int y
    * @return int Resultado de la suma
    */
    @Override
    public int suma(int x, int y) {
        // Se deben de ingresar dos numero para realizar la suma. 
        int retorno = x + y;
        return retorno;
    }


    /**
    * @author Marco Jurado 
    * @param int x
    * @param int y
    * @return int Resultado de la resta
    */
    @Override
    public int resta(int x, int y) {
        // Se deben de ingresar dos numeros para su resta. NO Conmutativa 
        // X primer numero
        // Y numero que se resta a X a.k.a segundo numero
        int retorno = x - y;
        return retorno;
    }


    /**
    * @author Marco Jurado 
    * @param int x
    * @param int y
    * @return int Resultado de la multiplicacion
    */
    @Override
    public int multiplicacion(int x, int y) {
        // Se deben de ingresar dos numeros para la multiplicacion
        int retorno = x * y;
        return retorno;
    }

    /**
    * @author Marco Jurado 
    * @param int x
    * @param int y
    * @return int Resultado de la division
    */
    @Override
    public int division(int x, int y) {
        // Se deben de ingresar dos valores para la division. NO Conmutativa
        // X numero 1, dividendo
        // Y numero 2, divisor
        int retorno = x / y;
        return retorno;
    }


    /**
    * @author Marco Jurado 
    * @param int stack
    * @return int Resultado de la operacion realizada
    */
    @Override
    public int operar(Stack x) {
        // Proceso de operar que toma los datos del Stack y realiza las operaciones 
        // identificadas. Devuelve un resultado de la operación

        if(x.size() == 0){
            //El stack está vacio... no hay nada que operar. Devuelve un 0 para indicar el resultado. 
            return 0;
        }

        Stack<String> procedimiento = new Stack<String>(); //Stack para realizar los procesos de operacion

        while(x.empty() != true){
            //Sigue operando hasta que el stack esté vacio y no haya mas por hacer

            //Las tres posiciones numericas basicas a utliizar en todo momento. Solo se tienen 3 pues solo hace una operacion a la vez.
        

            try{
                elemento_pila = x.pop().toString();
            }catch(Exception C){
                System.out.println("OW NO. Un error ha ocurrido. Favor contactar a su proveedor del codigo mas cercano. Osea... Marco Jurado");
            }

            switch(elemento_pila){
                //Diferentes casos que pueden ocurrir. Se realiza la operacion correcta en el caso de encontrar el operador.

                case "1":
                    procedimiento.push(elemento_pila); //agrega el numero a la pila de procedimiento hasta encontrar operador
                    System.out.println("Se ha añadido correctamente " + elemento_pila + " al stack");
                    break;
                case "2":
                    procedimiento.push(elemento_pila); //agrega el numero a la pila de procedimiento hasta encontrar operador
                    System.out.println("Se ha añadido correctamente " + elemento_pila + " al stack");
                    break;
                case "3":
                    procedimiento.push(elemento_pila); //agrega el numero a la pila de procedimiento hasta encontrar operador
                    System.out.println("Se ha añadido correctamente " + elemento_pila + " al stack");
                    break;
                case "4":
                    procedimiento.push(elemento_pila); //agrega el numero a la pila de procedimiento hasta encontrar operador
                    System.out.println("Se ha añadido correctamente " + elemento_pila + " al stack");
                    break;
                case "5":
                    procedimiento.push(elemento_pila); //agrega el numero a la pila de procedimiento hasta encontrar operador
                    System.out.println("Se ha añadido correctamente " + elemento_pila + " al stack");
                    break;
                case "6":
                    procedimiento.push(elemento_pila); //agrega el numero a la pila de procedimiento hasta encontrar operador
                    System.out.println("Se ha añadido correctamente " + elemento_pila + " al stack");
                    break;
                case "7":
                    procedimiento.push(elemento_pila); //agrega el numero a la pila de procedimiento hasta encontrar operador
                    System.out.println("Se ha añadido correctamente " + elemento_pila + " al stack");
                    break;
                case "8":
                    procedimiento.push(elemento_pila); //agrega el numero a la pila de procedimiento hasta encontrar operador
                    System.out.println("Se ha añadido correctamente " + elemento_pila + " al stack");
                    break;
                case "9":
                    procedimiento.push(elemento_pila); //agrega el numero a la pila de procedimiento hasta encontrar operador
                    System.out.println("Se ha añadido correctamente " + elemento_pila + " al stack");
                    break;
                case "+": 
                    //Caso especial que sea un operador de suma. Ejecuta el método de suma
                    try{
                        numerox = Integer.parseInt(procedimiento.pop());

                        numeroy = Integer.parseInt(procedimiento.pop());
                    }catch(Exception e){ System.out.println("Error! Falla total.");} 
                    
                    resultadoxy = suma(numerox, numeroy);
                    x.push(resultadoxy);
                    System.out.println("La suma de los numeros " + numerox + " y " + numeroy + " se ha realizado.");
                    System.out.println("El resultado " + resultadoxy + " se ha guardado en el stack.");
                    break;
                case "-": 
                    //Caso especial que sea un operador de resta. Ejecuta el método de suma
                    try{
                        numerox = Integer.parseInt(procedimiento.pop());

                        numeroy = Integer.parseInt(procedimiento.pop());
                    }catch(Exception e){ System.out.println("Error! Falla total.");} 
                    
                    resultadoxy = resta(numerox, numeroy);
                    x.push(resultadoxy);
                    System.out.println("La resta de los numeros " + numerox + " y " + numeroy + " se ha realizado.");
                    System.out.println("El resultado " + resultadoxy + " se ha guardado en el stack.");
                    break;
                case "*": 
                    //Caso especial que sea un operador de multiplicacion. Ejecuta el método de suma
                    try{
                        numerox = Integer.parseInt(procedimiento.pop());

                        numeroy = Integer.parseInt(procedimiento.pop());
                    }catch(Exception e){ System.out.println("Error! Falla total.");} 
                    
                    resultadoxy = multiplicacion(numerox, numeroy);
                    x.push(resultadoxy);
                    System.out.println("La multiplicacion de los numeros " + numerox + " y " + numeroy + " se ha realizado.");
                    System.out.println("El resultado " + resultadoxy + " se ha guardado en el stack.");
                    break;
                case "/": 
                    //Caso especial que sea un operador de division. Ejecuta el método de suma
                    try{
                        numerox = Integer.parseInt(procedimiento.pop());

                        numeroy = Integer.parseInt(procedimiento.pop());
                    }catch(Exception e){ System.out.println("Error! Falla total.");} 
                    
                    resultadoxy = division(numerox, numeroy);
                    x.push(resultadoxy);
                    System.out.println("La division de los numeros " + numerox + " y " + numeroy + " se ha realizado.");
                    System.out.println("El resultado " + resultadoxy + " se ha guardado en el stack.");
                    break;

            }

            


        }

        int fin = Integer.parseInt(procedimiento.pop()); // Resultado final de la operacion
        return fin;       
    }


    /**
    * @author Marco Jurado 
    * @param String a Nombre del archivo a leer
    * @return int Resultado de la suma
    */
    @Override
    public String decode(String a) {
        /**
         * Sirve para leer el archivo de texto y obtener la operacion en el formato postfix.
         */

        Stacked pila_lineas_Archivo = new Stacked();
        
        File nombre_archivo = new File((a + ".txt"));

        try{
            //intenta abirir el archivo 
            Scanner scan = new Scanner(nombre_archivo);
            while(scan.hasNextLine()){
                pila_lineas_Archivo.push(scan.nextLine());
            }
        }catch(FileNotFoundException C){
            //No se encontro el archivo. Se procede a mostrar el mensaje de error
            System.out.println("\n El archivo " + a + " .txt no s eencontro en la carpeta, intente nuevamente.");
        }

        /**Ahora el stack plia_lineas_Archivo contiene las lineas
         * del archivo. Lo siguiente es sacar cada dato de la linea */

         while(pila_lineas_Archivo.size() != 0){

            //Recorre la pila hasta que esta se encuentre vacía
            
         }
        return null;
    }
    
}
