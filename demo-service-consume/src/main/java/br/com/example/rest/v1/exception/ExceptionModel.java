package br.com.example.rest.v1.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExceptionModel {

    private Integer code;
    private String message;
}
