package br.com.example.impl.mapper.provider;

import br.com.example.impl.model.ClienteModel;
import org.apache.ibatis.jdbc.SQL;

public class InsertClienteProvider {

    private static final String TABLE_NAME = "cliente";

    public static String insereCliente(ClienteModel clienteModel){
        return new SQL(){
            {
                INSERT_INTO(TABLE_NAME);
                VALUES("nome_cliente", "#{nome}");
                VALUES("cidade_cliente", "#{cidade}");
                VALUES("dt_nasc_cliente", "#{dtNasc, typeHandler = br.com.example.impl.typeHandler.LocalDateTypeHandler}");
            }
        }.toString();

    }
}
