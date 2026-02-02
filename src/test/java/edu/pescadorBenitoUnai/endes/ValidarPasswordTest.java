package edu.pescadorBenitoUnai.endes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la clase {@link ValidadorPassword}
 *
 * <p>Esta clase comprueba que el validador de contraseñas en diferentes ocasiones como, contraseñas validas, contraseñas invalidas y valores nulos</p>
 */

public class ValidarPasswordTest {
    /**
     * Instancia del validador utilizado en las pruebas
     */
    private final  ValidadorPassword validador = new ValidadorPassword();

    /**
     * Prueba una contraseña valida
     *
     * <p>Verifica que una contraseña es cumple todas las reglas
     * (mayuscula, numero, longitu minima) devuelve {@code true}</p>
     */
    @Test
    void passwordValida(){
        assertTrue(validador.validar("Password1"));
    }

    /**
     * Prueba una contraseña sin mayuscula
     *
     * <p>Verifica que una contraseña no tiene mayuscula devuelve {@code false}</p>
     */
    @Test
    void passwordSinMayuscula(){
        assertFalse(validador.validar("password2"));
    }

    /**
     * Prueba que una contraseña no tiene numero
     *
     * <p>Verifica que una contraseña no tiene numero devuelve {@code false}</p>
     */
    @Test
    void passwordSinNumero(){
        assertFalse(validador.validar("Password"));
    }

    /**
     * Prueba que una contraseña no tiene longitud sificiente
     *
     * <p>Verifica que una contraseña no tiene la longitud suficiente devuelve {@code false}</p>
     */
     @Test
    void passwordCorta(){
         assertFalse(validador.validar("pass"));
    }

    /**
     * Prueba que una contraseña es nula
     *
     * <p>Verifica que devuelve {@code false} cuando la contrseña es {@code null}</p>
     */
    @Test
    void passwordNula(){
        assertFalse(validador.validar(null));
    }
}
