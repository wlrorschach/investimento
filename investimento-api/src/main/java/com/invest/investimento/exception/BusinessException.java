package com.invest.investimento.exception;

public class BusinessException extends Exception {
    private static final long serialVersionUID = -1508886119191473692L;

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException() {
        super();
    }

}
