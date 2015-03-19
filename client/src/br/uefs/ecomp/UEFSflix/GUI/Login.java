/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uefs.ecomp.UEFSflix.gui;

import br.uefs.ecomp.UEFSflix.controller.LoginController;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Hugo
 */
public class Login {

    public Login() {
        GridBagConstraints gbc = new GridBagConstraints();
        JFrame frame = new JFrame("UEFSflix");
        
        Container grid = new JPanel(new GridBagLayout());

        /* Prefixos:
         * Label = lbl
         * textfielf = txt
         * btn = button
         */
        JLabel lblName = new JLabel("Login: ", JLabel.CENTER);
        final JTextField txtName = new JTextField();
        txtName.setColumns(10);

        JLabel lblPassword = new JLabel("Senha: ", JLabel.CENTER);
        final JTextField txtPassword = new JPasswordField();
        txtPassword.setColumns(10);

        final JButton btnOk = new JButton("OK");
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                String password = txtPassword.getText();
                System.out.println(name + ' ' + password);
                LoginController.getInstance().requestLogin(name, password);
            }
        });
        
//        btnOk.addActionListener(new ActionListener() {
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
        grid.add(lblName, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        grid.add(txtName, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        grid.add(lblPassword, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        grid.add(txtPassword, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        grid.add(btnOk, gbc);
        

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(grid);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
