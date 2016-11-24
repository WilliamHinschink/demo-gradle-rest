package br.com.example.impl.service;

import br.com.example.impl.mapper.CidadeMapper;
import br.com.example.impl.model.CidadeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by william on 21/11/2016.
 */
@Service
public class CidadeService {

    @Autowired
    private CidadeMapper cidadeMapper;

    public List<CidadeModel> findAllCidades(){return cidadeMapper.findAllCidades();}

    public CidadeModel findCidadebyId(Long id){return cidadeMapper.getCidade(id);}
}
