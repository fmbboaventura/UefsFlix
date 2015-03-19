/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uefs.ecomp.UEFSflix.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hugo
 */
public class Conexao {
    Statement stmt;
    String sql;
    ResultSet res;

    public Conexao() throws SQLException  {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/uefsflix", "root", "");
        stmt = con.createStatement();
    }

    /* public boolean Verificar(String nome) throws SQLException{
     sql = "SELECT * FROM `uefsflix`.`usuarios` WHERE LoginUsuario ='"+nome+"'";    
     res = stmt.executeQuery(sql);
     if(res.next() == true)
     return true;
     return false;
     }*/
    public boolean inserir(String nome, String senha) throws SQLException {

        sql = "INSERT INTO `uefsflix`.`usuarios` (`LoginUsuario`, `Senhausuario`) VALUES ('+ " + nome + "', '+ " + senha + "');";
        stmt.executeUpdate(sql);
        return true;

    }

    public boolean validar(String nome, String senha) throws SQLException {
        //sql = "SELECT * FROM usuarios WHERE LoginUsuario ="+ nome +"AND Senhausuario="+senha; 
        sql = "SELECT * FROM `uefsflix`.`usuarios` WHERE LoginUsuario ='" + nome + "' AND Senhausuario=" + senha;
        res = stmt.executeQuery(sql);

        return res.next() == true;
    }

    public ResultSet pesquisar(String palavras) throws SQLException {
        int i = 0;
        sql = "";
        String div[] = palavras.split(" ");
        while (div.length > i) {
            sql = sql + "SELECT * FROM usuarios WHERE LoginUsuario LIKE'%" + div[i] + "%'";
            if (!(i == div.length - 1)) {
                sql = sql + " union ";
            }
            i++;
        }
        sql = sql + " order by idusuario";
        return res = stmt.executeQuery(sql);
    }
}

//   public String pesquisar(String palavras){
//       int i = 0;String frase=null;
//        String div[] = palavras.split(",");
//        while (div.length > i){
//            frase = frase+ "SELECT * FROM usuarios WHERE LoginUsuario LIKE'%"+div[i]+"%'";
//            if(!(i == div.length-1))
//            frase = frase+ "union";
//                    }
//        return null;
//}

