package br.com.example.rest.v1.binder;

import br.com.example.impl.model.CidadeModel;
import br.com.example.impl.model.ClienteModel;
import br.com.example.rest.v1.model.Cliente;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class ClienteBinder {

    public static List<Cliente> bindListFromImpl(List<ClienteModel> clienteModels){
        if (clienteModels == null)
            return null;
        return clienteModels.stream().map(ClienteBinder::bindFromImpl)
                .collect(Collectors.toList());
    }

    public static Cliente bindFromImpl(ClienteModel clienteModel){
        return Cliente.builder()
                .id(clienteModel.getId())
                .nome(clienteModel.getNome())
                .cidade(CidadeBinder.bindFromImpl(clienteModel.getCidadeModel()))
                .dtNasc(clienteModel.getDtNasc().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
                .build();
    }

    public static ClienteModel bindToModel(Cliente cliente){
        return ClienteModel.builder()
                .id(cliente.getId())
                .nome(cliente.getNome())
                .cidadeModel(CidadeBinder.bindToModel(cliente.getCidade()))
                .dtNasc(LocalDate.parse(cliente.getDtNasc(), DateTimeFormatter.ofPattern("dd/MM/yyyy")))
                .build();
    }
}
