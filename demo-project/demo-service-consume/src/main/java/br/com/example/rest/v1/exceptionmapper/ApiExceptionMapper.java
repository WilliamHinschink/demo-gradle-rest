package br.com.example.rest.v1.exceptionmapper;

import br.com.example.impl.exception.ApiException;
import br.com.example.rest.v1.exception.ExceptionModel;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * Created by william on 30/11/2016.
 */
public class ApiExceptionMapper implements ExceptionMapper<ApiException> {

    @Override
    public Response toResponse(ApiException exception){
        return Response.status(exception.httpCode())
                .entity(buildExceptionModel(exception))
                .type(MediaType.APPLICATION_JSON)
                .build();
    }

    public ExceptionModel buildExceptionModel(ApiException exception){
        return ExceptionModel.builder()
                .code(exception.code())
                .message(exception.message())
                .build();
    }
}
