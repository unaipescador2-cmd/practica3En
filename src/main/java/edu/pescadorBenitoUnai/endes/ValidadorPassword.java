package edu.pescadorBenitoUnai.endes;

import java.util.regex.Pattern;

/**
 * Clase encargada de validar las contrsaeñas segun conjunto de reglas basicas
 *
 * <p> Las reglas basicas son:<p/>
 * <ul>
 *     <li>Tiene que tener 8 cracteres por lo menos</li>
 *     <li>Tiene que tener una mayuscula por lo menos</li>
 *     <li>tiene que tener al menos un numero</li>
 *     <li>No puede tener un valor nulo</li>
 * </ul>
 */

public class ValidadorPassword {
/**
 * Patron de expresion para validar las contraseñas
 *
 * <p>Este patron comprueba que la contraseña tenga por lo meos 8 caracteres, tenga una mayuscula y al menos un numero</p>
 */
    private static final Pattern PASSWORD_PATTERN=
        Pattern.compile("^(?=.*[A-Z])(?=.*\\d).{8,}$");
    /**
     * Valida si la contraseña comple los requisitos necesarios
     *
     * @param password la contraseña a validar
     * @return {@code true} si la contraseña cumple los requisitos,
     *         {@code false} si la contraseña no cumple los requisitos o si es {@code null}
     */
    public boolean validar (String password){
        if (password==null ){
            return false;
        }
        return PASSWORD_PATTERN.matcher(password).matches();
    }
}
