package br.com.example.rest.v1.exception;

import br.com.example.impl.exception.ApiException;
import org.apache.commons.lang3.StringUtils;

import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

public class InputException extends ApiException{

    private List<String> messages;

    public InputException(String message) {
        this.messages = Arrays.asList(message);
    }

    public InputException(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public Integer code() {
        return 3;
    }

    @Override
    public String message() {
        return StringUtils.join(messages, ", ");
    }

    @Override
    public Response.Status httpCode() {
        return Response.Status.BAD_REQUEST;
    }
}
