package br.com.example.rest.v1.exception;

import lombok.Builder;
import lombok.Data;

/**
 * Created by william on 30/11/2016.
 */
@Data
@Builder
public class ExceptionModel {

    private Integer code;
    private String message;
}
