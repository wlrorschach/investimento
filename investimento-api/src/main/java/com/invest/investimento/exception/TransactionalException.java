package com.invest.investimento.exception;

public class TransactionalException extends Exception {
    private static final long serialVersionUID = -3382236519521284639L;

    public TransactionalException(String message) {
        super(message);
    }

    public TransactionalException() {
        super();
    }

}
