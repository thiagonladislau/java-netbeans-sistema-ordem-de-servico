/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infoos.dal;

import java.sql.*;
import br.com.infoos.dal.ModuloConexao;

/**
 *
 * @author Ladislau
 */
public class ModuloConexao {
    //conexao com banco de dados
    public static Connection conector(){
        //a variavel conexao irá receber uma string de conexao do banco
        java.sql.Connection conexao = null;
        //chamando o driver importado do mysql. 
        String driver = "com.mysql.cj.jdbc.Driver";
        //Armazenando informações referente ao banco
        String url="jdbc:mysql://localhost:3306/dbinfox";
        String user="root";
        String password = "@admin..2023";
        
        //Estabelecendo a conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;            
        } catch (Exception e) {
            System.out.println("Não foi possivel conectar, Motivo: "+e);
            return null;
        }
    }
}
