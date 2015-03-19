/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uefs.ecomp.UEFSflix.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Hugo
 */
public class Login {

    public static void main(String[] args) {
        GridBagConstraints gbc = new GridBagConstraints();
        JFrame frame = new JFrame("UEFSflix");
        
        Container grid = new JPanel(new GridBagLayout());
        JLabel label = new JLabel("", JLabel.CENTER);

        JLabel nome = new JLabel("Login: ", JLabel.CENTER);
        JTextField nomeCampo = new JTextField("                 ");
        JLabel senha = new JLabel("Senha: ", JLabel.CENTER);
        JTextField senhaCampo = new JPasswordField("       ");
        JButton ok = new JButton("OK");
        
//        ok.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//               try {
//                    controller.addCidade(nomeFild.getText());
//                    JOptionPane.showMessageDialog(AddCidade, "Cadastro efetuado!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);//new MessageWindow("Cadastro efetuado!");
//                    AddCidade.setVisible(false);
//               } catch (CidadeJaExisteException ex) {
//                    JOptionPane.showMessageDialog(AddCidade, "Esta cidade já esta cadastrada!", "Atenção", JOptionPane.WARNING_MESSAGE);//new MessageWindow("Este cliente já esta cadastrado!");
//                }
//            }
//        });
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        grid.add(nome, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        grid.add(nomeCampo, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        grid.add(senha, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        grid.add(senhaCampo, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        grid.add(ok, gbc);
        

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(grid);
        frame.setLocationRelativeTo(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
