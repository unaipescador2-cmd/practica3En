package edu.pescadorBenitoUnai.endes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba unitaria para la clase {@link ConversorTemperatura}
 *
 * <p>Esta clase valida que las conversiones entre grados Celsius y Fahrenheit se relicen correctamente con los valores que le hemos puesto como referencia </p>
 */

public class ConversorTemperaturaTest {
    /**
     * Instancia del conversor utilizado en las pruebas
     */
    private final ConversorTemperatura conversor = new ConversorTemperatura();
    /**
     * Prueba el metodo {@link ConversorTemperatura#celsiusAFahrenheit(double)}
     *
     * <p>Verifica que 0 grados Celsius se convierten correctamente en 32 grados Fahrenheit</p>
     */
    @Test
    void testCelsiusAFahrenheit(){
        assertEquals(32, conversor.celsiusAFahrenheit(0));
    }

    /**
     * Prueba el metodo {@link ConversorTemperatura#fahrenheitACelsius(double)}
     *
     * <p>Verifica que 32 grados Fahrenheit sean 0 Celsius</p>
     */
    @Test
    void testFahrenheitACelsius(){
        assertEquals(0, conversor.fahrenheitACelsius(32));
    }
}
