package br.com.example.impl.mapper.provider;

import br.com.example.impl.model.ClienteModel;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class InsertClienteProvider {

    private static final String TABLE_NAME = "cliente";

    public static String insereCliente(Map params){
        ClienteModel clienteModel = (ClienteModel) params.get("clienteModel");
        String query = new SQL() {
            {
                INSERT_INTO(TABLE_NAME);
                VALUES("nome_cliente", "#{clienteModel.nome}");
                VALUES("id_cidade", "#{clienteModel.cidadeModel.id}");
                VALUES("dt_nasc_cliente", "#{clienteModel.dtNasc}");
            }
        }.toString();
        return query;
    }
}
