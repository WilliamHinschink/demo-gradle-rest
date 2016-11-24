package br.com.example.impl.service;

import br.com.example.impl.mapper.ClienteMapper;
import br.com.example.impl.model.ClienteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteMapper clienteMapper;

    public List<ClienteModel> findAllClientes() { return clienteMapper.findAllClientes(); }

    public ClienteModel findById(Long id) {return clienteMapper.findById(id);}

    public boolean deleteById(Long id) {
        return clienteMapper.deleteById(id);
    }

    public boolean isClienteExist(ClienteModel clienteModel) {return findById(clienteModel.getId()) != null;}

    public ClienteModel insertCliente(ClienteModel clienteModel) {return clienteMapper.insertCliente(clienteModel);}

    public boolean updateCliente(ClienteModel clienteModel) { return clienteMapper.updateCliente(clienteModel); }

    public List<ClienteModel> findByName(String nome){ return clienteMapper.findByName(nome);}
}
