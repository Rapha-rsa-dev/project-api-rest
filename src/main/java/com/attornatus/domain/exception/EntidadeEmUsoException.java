package com.attornatus.domain.exception;

/**
 * Exceção para casos de entidades não encontradas (Status HTTP 404 - NOT FOUND)
 *
 * @author RaphaDev
 */
public class EntidadeEmUsoException extends EntidadeNaoEncontradaException {

    public EntidadeEmUsoException(String msg) {
        super(msg);
    }
}
