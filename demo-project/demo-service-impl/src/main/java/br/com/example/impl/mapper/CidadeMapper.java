package br.com.example.impl.mapper;

import br.com.example.impl.model.CidadeModel;
import br.com.example.impl.model.CidadeModel;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CidadeMapper {

    @Results(value = {
            @Result(column = "id_cidade", property = "id"),
            @Result(column = "nome_cidade", property = "nome")
    })
    @Select("SELECT * FROM cidade")
    List<CidadeModel> findAllCidades();

    @Results(value = {
            @Result(column = "id_cidade", property = "id"),
            @Result(column = "nome_cidade", property = "nome")
    })
    @Select("SELECT * FROM cidade WHERE id_cidade = #{id}")
    CidadeModel getCidade(Long id);
}
