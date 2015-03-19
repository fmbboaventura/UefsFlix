/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uefs.ecomp.UEFSflix.model;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;


/**
 *
 * @author Hugo
 */
public class Servidor  {
    
    public static boolean validar(String nome, String senha) throws SQLException{
        Conexao a = new Conexao();
        return a.validar(nome, senha);
    }
    public static void main(String[] args)throws Exception {
        
        //System.out.println(validar("muhulalalalala", "123"));
        //Apenas para indicar
        System.out.println("Iniciando Servidor");
        ServerSocket server = new ServerSocket(2525);
        System.out.println("Aguardando conexão");
        //obejeto que vai receber dados do cliente e enviar dados ao cliente 
        Socket socket = server.accept();
        System.out.println("Conexão feita com sucesso");
        
        InputStream imput = socket.getInputStream();
        OutputStream output = socket.getOutputStream();
        
        BufferedReader in = new BufferedReader(new InputStreamReader(imput));
        PrintStream out = new PrintStream(output);
        
        while(true){
            String nome = in.readLine();
            String senha = in.readLine();
            if (validar(nome, senha))
            System.out.println("Usuário " +nome + "--- Foi logado com sucesso");
            out.println(true);
            
//            System.out.println("mensagem recebida: "+ string
//            + "----- enviada por [" + socket.getInetAddress().getHostName()+ "]");
//            if(string.equals("fim")){
//                in.close();
//                out.close();
//                socket.close();
//                server.close();
//                System.out.println("Conexão finalizada");
//                break;
//            
//            }
//                    
//        }
//        
//        System.out.println("Servidor encerrado");
        
        
        
        
        
    }
    
}
}
