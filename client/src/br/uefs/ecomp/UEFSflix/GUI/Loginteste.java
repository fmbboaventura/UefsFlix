/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uefs.ecomp.UEFSflix.GUI;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Hugo
 */
public class Loginteste {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Melhor Rota ponto Com");
        Container containier = new JPanel(/*new BorderLayout()*/);
        Container grid = new JPanel(new GridLayout(4, 2));
        JLabel label = new JLabel("", JLabel.CENTER);

        JButton addCidade = new JButton("Adicionar Cidade");
        JButton removerCidade = new JButton("Remover Cidade");
        JButton addEstrada = new JButton("Adicionar Estrada");
        JButton removerEstrada = new JButton("Remover Estrada");
        JButton addComplicacao = new JButton("Adicionar Complicação");
        JButton removerComplicacao = new JButton("Remover complicação");
        JButton CalcRota = new JButton("Calcular rota");
        
        
        grid.add(addCidade);
        grid.add(removerCidade);
        grid.add(addEstrada);
        grid.add(removerEstrada);
        grid.add(addComplicacao);
        grid.add(removerComplicacao);
        grid.add(CalcRota);



        containier.add(label, BorderLayout.NORTH);
        containier.add(grid, BorderLayout.CENTER);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(containier);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
