package com.qiushui1012.lib.registry.exception;

public class UnknownIDException extends RuntimeException {
    public UnknownIDException() {
        super();
    }

    public UnknownIDException(String message) {
        super(message);
    }
}
