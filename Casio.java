/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Stack.java
* Autor: Marco Jurado 
*
* Interfaz calculadora
********************************************************/
public class Casio implements calculadora{

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
    public int operar(stack x) {
        // Proceso de operar que toma los datos del Stack y realiza las operaciones 
        // identificadas. Devuelve un resultado de la operación

        String operando1 = Stack
        return 0;
    }


    /**
    * @author Marco Jurado 
    * @param String a Nombre del archivo a leer
    * @return int Resultado de la suma
    */
    @Override
    public String decode(String a) {
        // TODO Auto-generated method stub
        
        return null;
    }
    
}
