package br.com.example.impl.service;

import br.com.example.impl.exception.NenhumClienteEncontradoException;
import br.com.example.impl.mapper.CidadeMapper;
import br.com.example.impl.mapper.ClienteMapper;
import br.com.example.impl.model.ClienteModel;

import java.util.List;

public class ClienteService {

    private ClienteMapper clienteMapper;
    private CidadeMapper cidadeMapper;

    public ClienteService(ClienteMapper clienteMapper) {this.clienteMapper = clienteMapper;}

    public List<ClienteModel> findAllClientes() {
        List<ClienteModel> clienteModels = clienteMapper.findAllClientes();
        if(clienteModels.isEmpty()) throw new NenhumClienteEncontradoException();
        return clienteModels;
    }

    public ClienteModel findById(Long id) {
        ClienteModel clienteModel = clienteMapper.findById(id);
        if (clienteModel == null) throw new NenhumClienteEncontradoException();
        return clienteModel;
    }

    public boolean deleteById(Long id) {return clienteMapper.deleteById(id);}

    public boolean isClienteExist(ClienteModel clienteModel) {
        return findById(clienteModel.getId()) != null;
    }

    public void insertCliente(ClienteModel clienteModel) {
        clienteMapper.insertCliente(clienteModel);
    }

    public boolean updateCliente(ClienteModel clienteModel) {return clienteMapper.updateCliente(clienteModel);}

    public List<ClienteModel> findByName(String nome) {
        List<ClienteModel> clienteModels = clienteMapper.findByName(nome);
        if(clienteModels.isEmpty()) throw new NenhumClienteEncontradoException();
        return clienteModels;
    }
}
