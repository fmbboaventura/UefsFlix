/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uefs.ecomp.UEFSflix.controller;


import br.uefs.ecomp.UEFSflix.model.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hugo
 */
public class Controller {

    Conexao con;

    public Controller() throws SQLException {
        Conexao con = new Conexao();
    }
    
    public boolean inserir(String nome, String senha) throws SQLException {
        return con.inserir(nome, senha);
    }
    
    public boolean validar(String nome, String senha) throws SQLException{
        return con.validar(nome, senha);
    }
    
    public ResultSet pesquisar(String pesquisa) throws SQLException{
        return con.pesquisar(pesquisa);
    }
}
