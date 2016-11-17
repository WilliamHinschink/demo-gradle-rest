package br.com.example.impl.mapper;

import br.com.example.impl.model.Cliente;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by william on 16/11/2016.
 */
public interface ClienteMapper {

    @Results({
            @Result(property = "id",column = "id_cliente"),
            @Result(property = "nome",column = "nome_cliente"),
            @Result(property = "cidade",column = "cidade_cliente"),
            @Result(property = "dtNasc",column = "dt_nasc_cliente")
    })

    @Select("SELECT * FROM cliente")
    List<Cliente> findAllClientes();

    @Select("SELECT * FROM cliente WHERE id_cliente = #{id}")
    Cliente findById(long id);
}
