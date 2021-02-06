/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Stack.java
* Autor: Marco Jurado 
*
* Interfaz Calculadora
* Interface de la calculadora
********************************************************/

import java.util.Vector;

public class Stacked implements Stack<String> {

    //----------------------------------------------------- Atributos ----------------------------------------------------------

    private Vector<E> stack; 

    //----------------------------------------------------- Metodos ----------------------------------------------------------

    /**
    * Constructor for StackImplementation class 
    */
    public Stacked (){
        this.stack = new Vectort<E>();
    }

    /**
    * @author Marco Jurado 
    * @param String dato
    * @return void
    */
    @Override
    public void push(String dato) {
        stack.add(dato);
    }

    /**
    * @author Marco Jurado
    * @return String 
    */
    @Override
    public String pop() {
        if (empty()){
            return null;
            
        } else {
            return stack.remove(this.stack.size() - 1);
        }
    }

    /**
    * @author Marco Jurado
    * @return String 
    */
    @Override
    public String peek() {
        if (empty()){
            return null;
            
        } else {
            return this.stack.get(this.stack.size() - 1);
        }
    }

    /**
    * @author Marco Jurado
    * @return Boolean, verifica si esta vacio o no. Devuelve True o False dependiendo si stack tiene o no contenidos
    */
    @Override
    public boolean empty() {
        return (stack.isEmpty());
    }

    /**
    * @author Marco Jurado
    * @return int, devuelve el tamaño del stack 
    */
    @Override
    public int size() {
        return stack.size();
    }
}
