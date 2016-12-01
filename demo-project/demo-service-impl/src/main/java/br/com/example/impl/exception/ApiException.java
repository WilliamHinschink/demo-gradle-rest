package br.com.example.impl.exception;

import javax.ws.rs.core.Response;

public abstract class ApiException extends RuntimeException {

    public abstract Integer code();

    public abstract String message();

    public abstract Response.Status httpCode();
}
