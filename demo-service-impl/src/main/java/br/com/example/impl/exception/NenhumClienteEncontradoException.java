package br.com.example.impl.exception;

import javax.ws.rs.core.Response;

public class NenhumClienteEncontradoException extends ApiException{

    @Override
    public Integer code() { return null; }

    @Override
    public String message() { return "Nenhum Cliente encontrado!"; }

    @Override
    public Response.Status httpCode() { return Response.Status.NOT_FOUND; }
}