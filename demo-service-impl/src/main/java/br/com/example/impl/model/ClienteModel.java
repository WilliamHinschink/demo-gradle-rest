package br.com.example.impl.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteModel {

    private Long id;
    private String nome;
    private CidadeModel cidadeModel;
    private LocalDate dtNasc;
}
