package br.com.example.impl.service;

import br.com.example.impl.mapper.ClienteMapper;
import br.com.example.impl.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by william on 16/11/2016.
 */
@Service
public class ClienteService {

    @Autowired
    private ClienteMapper clienteMapper;

    public List<Cliente> findAllClientes() {return clienteMapper.findAllClientes();}

    public Cliente findById(long id) {
        return clienteMapper.findById(id);
    }
}
