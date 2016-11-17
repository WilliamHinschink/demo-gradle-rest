package br.com.example.impl.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by william on 16/11/2016.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    private Long id;
    private String nome;
    private String cidade;
    private Date dtNasc;


}
