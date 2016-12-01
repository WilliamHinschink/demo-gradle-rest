package br.com.example.impl.service;

import br.com.example.impl.mapper.CidadeMapper;
import br.com.example.impl.mapper.ClienteMapper;
import br.com.example.impl.model.CidadeModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceModule {

    @Bean
    public ClienteService clienteService(ClienteMapper clienteMapper){
        return new ClienteService(clienteMapper);
    }

    @Bean
    public CidadeService cidadeService(CidadeMapper cidadeMapper){return new CidadeService(cidadeMapper);}

}
