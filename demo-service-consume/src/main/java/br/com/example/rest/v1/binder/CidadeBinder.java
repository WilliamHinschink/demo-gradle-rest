package br.com.example.rest.v1.binder;

import br.com.example.impl.model.CidadeModel;
import br.com.example.rest.v1.model.Cidade;

public class CidadeBinder {

    public static Cidade bindFromImpl(CidadeModel cidadeModel){
        return Cidade.builder()
                .id(cidadeModel.getId())
                .nome(cidadeModel.getNome())
                .build();
    }

    public static CidadeModel bindToModel(Cidade cidade){
        return CidadeModel.builder()
                .id(cidade.getId())
                .nome(cidade.getNome())
                .build();
    }
}
