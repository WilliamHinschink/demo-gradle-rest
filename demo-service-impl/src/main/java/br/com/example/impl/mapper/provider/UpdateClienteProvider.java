package br.com.example.impl.mapper.provider;

import br.com.example.impl.model.ClienteModel;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class UpdateClienteProvider {

    private static String TABLE_NAME = "cliente";

    public static String updateCliente(Map params){
        ClienteModel clienteModel =  (ClienteModel) params.get("clienteModel");
        String query =  new SQL(){
            {
                UPDATE(TABLE_NAME);
                if(!StringUtils.isEmpty(clienteModel.getNome())){
                    SET("nome_cliente = #{clienteModel.nome}");
                }
                if (clienteModel.getCidadeModel().getId() != null ){
                    SET("id_cidade = #{clienteModel.cidadeModel.id}");
                }
                if (clienteModel.getDtNasc() != null){
                    SET("dt_nasc_cliente = #{clienteModel.dtNasc}");
                }
                WHERE("id_cliente = #{clienteModel.id}");
            }
        }.toString();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(query);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
        return query;
    }
}
