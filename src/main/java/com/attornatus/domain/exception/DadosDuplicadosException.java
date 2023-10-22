package com.attornatus.domain.exception;

/**
 * Exceção para casos de tentativa de cadastro duplicado. (Status HTTP 400 - BAD
 * REQUEST)
 *
 * @author RaphaDev
 */
public class DadosDuplicadosException extends RuntimeException {

    public DadosDuplicadosException(String msg) {
        super(msg);
    }
}
