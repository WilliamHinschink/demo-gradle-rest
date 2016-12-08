package br.com.example.impl.mapper;

import br.com.example.impl.mapper.provider.*;
import br.com.example.impl.model.CidadeModel;
import br.com.example.impl.model.ClienteModel;
import br.com.example.impl.typeHandler.LocalDateTypeHandler;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

public interface ClienteMapper {

    @Results(value = {
            @Result(property = "id", column = "id_cliente"),
            @Result(property = "nome", column = "nome_cliente"),
            @Result(property = "dtNasc", column = "dt_nasc_cliente", typeHandler = LocalDateTypeHandler.class),
            @Result(property = "cidadeModel", column = "id_cidade", javaType = CidadeModel.class, one = @One(select = "br.com.example.impl.mapper.CidadeMapper.getCidade"))
    })
    @Select("SELECT * FROM cliente")
    List<ClienteModel> findAllClientes();

    @Results(value = {
            @Result(property = "id", column = "id_cliente"),
            @Result(property = "nome", column = "nome_cliente"),
            @Result(property = "dtNasc", column = "dt_nasc_cliente", typeHandler = LocalDateTypeHandler.class),
            @Result(property = "cidadeModel", column = "id_cidade", javaType = CidadeModel.class, one = @One(select = "br.com.example.impl.mapper.CidadeMapper.getCidade"))
    })
    @Select("SELECT * FROM cliente WHERE id_cliente = #{id}")
    ClienteModel findById(@Param("id") Long id);

    @Results(value = {
            @Result(property = "id", column = "id_cliente"),
            @Result(property = "nome", column = "nome_cliente"),
            @Result(property = "dtNasc", column = "dt_nasc_cliente", typeHandler = LocalDateTypeHandler.class),
            @Result(property = "cidadeModel", column = "id_cidade", javaType = CidadeModel.class, one = @One(select = "br.com.example.impl.mapper.CidadeMapper.getCidade"))
    })
    @Delete("DELETE FROM cliente WHERE id_cliente = #{id}")
    boolean deleteById(@Param("id") Long id);

    @InsertProvider(type = InsertClienteProvider.class, method = "insereCliente")
    @Options(useGeneratedKeys = true, keyProperty = "clienteModel.id", keyColumn = "id_cliente")
    void insertCliente(@Param("clienteModel") ClienteModel clienteModel);

    //@Update("UPDATE cliente SET nome_cliente = #{nome} WHERE id_cliente = #{id}")
    @UpdateProvider(type = UpdateClienteProvider.class, method = "updateCliente")
    boolean updateCliente(@Param("clienteModel") ClienteModel clienteModel);

    @Results(value = {
            @Result(property = "id", column = "id_cliente"),
            @Result(property = "nome", column = "nome_cliente"),
            @Result(property = "dtNasc", column = "dt_nasc_cliente", typeHandler = LocalDateTypeHandler.class),
            @Result(property = "cidadeModel", column = "id_cidade", javaType = CidadeModel.class, one = @One(select = "br.com.example.impl.mapper.CidadeMapper.getCidade"))
    })
    @Select("SELECT * FROM cliente WHERE nome_cliente LIKE '%${nome}%'")
    List<ClienteModel> findByName(@Param("nome") String nome);
}
