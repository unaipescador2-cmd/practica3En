package edu.pescadorBenitoUnai.endes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la clase {@link Calculadora}.
 * <p>Esta clase verifica el correcto funcionamiento de las operaciones
 * aritméticas básicas y comprueba el comportamiento ante casos de error,
 * como la división entre cero.</p>
 */
public class CalculadoraTest {
    /**
     * Instancia de la calculadora utilizada en las pruebas.
     */
    private final Calculadora calc = new Calculadora();
    /**
     * Prueba el metodo {@link Calculadora#sumar(double, double)}
     *
     * <p>Verifica que la suma de los dos numeros devuelve el resultado</p>
     */
    @Test
    void testSumar(){
        assertEquals(5, calc.sumar(3, 3));
    }
    
    /**
     * Prueba el metodo {@link Calculadora#restar(double, double)}.
     *
     * <p>Verifica que la resta de dos números devuelve el resultado esperado.</p>
     */
    @Test
    void testRestar(){
        assertEquals(1, calc.restar(4, 3));
    }

    /**
     * Prueba el metodo {@link Calculadora#multiplicar(double, double)}
     *
     * <p>Verifica que la multiplicacion devuelva el resultado correcto</p>
     */
    @Test
    void testMultiplicar (){
        assertEsquals(6, calc.multiplicar(4, 3));
    }

    /**
     * Prueba el metodo {@link Calculadora#dividir(double, double)}Cuando no es entre 0
     *
     * <p>Verifica que el resultado de la division devuelve el resultado correcto</p>
     */
    @Test
    void testDivision(){
        assertEquals(2, calc.dividir(6,3));
    }

    /**
     * Prueba el metodo {@link Calculadora#dividir(double, double)}Cuando es entre 0
     *
     * <p>Verifica que se lanza una {@link IllegalArgumentException} al intentar dividir entre 0</p>
     */
    @Test
    void testDividirPorCero(){
        assertThrows(IllegalArgumentException.class, ()-> calc.dividir(4,0));
    }

}
