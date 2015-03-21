/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uefs.ecomp.UEFSflix.model.scl;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author Hugo and Filipe
 */
public class Client {
     public static enum RequestType{
         LOGIN,
         LOGOUT,
         QUERY,
         DOWNLOAD
     }
    private Socket client;

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
//                 System.out.println("Solicitação de encerramento do Client");
//                 in.close();
//                 out.close();
//                 socket.close();
//                 System.out.println("Client encerrado");
//                 break;}
        }
        //System.out.println("Mensagem enviada ao servidor: "+ string);
    }

    public void connect(String name, String password) throws IOException {
        client = new Socket("127.0.0.1",12345);
        request(RequestType.LOGIN.toString(), name, password);
    }

    public void disconnect() throws IOException {
        client.close();
    }

    private void request(String... args) throws IOException {
        ObjectOutputStream stream = new ObjectOutputStream(client.getOutputStream());
        stream.writeObject(args);
    }

}