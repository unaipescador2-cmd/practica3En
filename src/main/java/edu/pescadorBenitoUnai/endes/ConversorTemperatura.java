package edu.pescadorBenitoUnai.endes;

/**
 * Esta es la clase que nos permite convertir valores de temperatura de grados a celsius a fahrenheit
 *
 * <p>Usa las formulas matematicas estandar para realizar las conversiones</p>
 */
public class ConversorTemperatura {
    /**
     * convierte una temperatura de grados celsius a grados fahrenheit
     *
     * <p>Formula utilizada</p>
     * <pre>
     *     Fahrenheit = (Celsius * 9/5) + 32
     * </pre>
     *
     * @param gahrenheit temperatura en grados Fahrenheit
     * @return temperatura convertida a grados Celsius
     */
    public double fahrenheitACelsius(double fahrenheit){
        return (fahrenheit-32)*5/9;
    }
}
