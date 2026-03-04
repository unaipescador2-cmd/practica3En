package edu.pescadorBenitoUnai.endes;
/**
 * Esta clase impleentara las operaciones aritmeticas basicas
 */

public class Calculadora {
    /**
     * Suma de dos numeros reales
     * @param a primer numero a sumar
     * @param b segundo numero a sumar
     * @return la suma de {@code a } y {@code b}
     */
    public double sumar (double a, double b){
        return a+b;
    }

    /**
     * resta de dos numeros reales
     * @param a primer numero a restar
     * @param b segundo nuemro a restar
     * @return la resta de {@code a } y {@code b}
     */
    public double restar (double a, double b){
        return a-b;
    }
    /**
     * miltiplicacion de dos numeros reales
     * @param a primer numero a multiplicar
     * @param b segundo numero a multiplicar
     * @return la multiplicacion de {@code a } y {@code b}
     */
    public double multiplicar (double a, double b){
        return a*b;
    }

    /**
     * division de dos numeros naturales
     * @param a primer numero a dividir
     * @param b segundo numero a dividir
     * @return la division de {@code a } y {@code b}
     */
    public double dividir (double a, double b){
        if (b==0){
            throw new IllegalArgumentException("No se puede dividir entre 0");
        }
        return a/b;
    }
}
