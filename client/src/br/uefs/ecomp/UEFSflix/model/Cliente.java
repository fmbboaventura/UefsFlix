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
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Hugo
 */
public class Cliente {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 2525);
        System.out.println("Aguardando resposta do servidor");

        InputStream imput = socket.getInputStream();
        OutputStream output = socket.getOutputStream();

        BufferedReader in = new BufferedReader(new InputStreamReader(imput));
        PrintStream out = new PrintStream(output);
        System.out.println("Conexão com o servidor foi realizada");

        //objectimputstream
        //objectOutputStrem


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite nome do usuário");
            String string = scanner.nextLine();
            out.println(string);
            System.out.println("Digite senha do usuário");
            string = scanner.nextLine();
            out.println(string);
            System.out.println(in.readLine());

//             if(string.equals("fim")){
//                 System.out.println("Solicitação de encerramento do Cliente");
//                 in.close();
//                 out.close();
//                 socket.close();
//                 System.out.println("Cliente encerrado");
//                 break;
        }
        //System.out.println("Mensagem enviada ao servidor: "+ string);
    }

}