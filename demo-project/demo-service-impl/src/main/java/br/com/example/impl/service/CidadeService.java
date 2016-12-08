package br.com.example.impl.service;

import br.com.example.impl.mapper.CidadeMapper;
import br.com.example.impl.model.CidadeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

public class CidadeService {

    private CidadeMapper cidadeMapper;

    public CidadeService(CidadeMapper cidadeMapper) {this.cidadeMapper = cidadeMapper;}

    public List<CidadeModel> findAllCidades(){return cidadeMapper.findAllCidades();}

    public CidadeModel findCidadebyId(Long id){return cidadeMapper.getCidade(id);}
}
