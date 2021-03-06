package br.com.example.rest.v1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    private Long id;
    private String nome;
    private Cidade cidade;
    private String dtNasc;
}
