/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cont_cliques;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cont_Cliques { 

    private static int contador = 0;

    public static void main(String[] args) {

        JFrame janela = new JFrame("Minha Interface em Java");
        janela.setSize(350, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);

        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS));

        JLabel textoCliques = new JLabel("Cliques: 0");
        textoCliques.setFont(new Font("SansSerif", Font.BOLD, 24));
        textoCliques.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        painelBotoes.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton botaoClique = new JButton("Clique aqui");
        JButton botaoZerar = new JButton("Zerar");

        botaoClique.addActionListener(e -> {
            contador++;
            textoCliques.setText("Cliques: " + contador);
        });

        botaoZerar.addActionListener(e -> {
            contador = 0;
            textoCliques.setText("Cliques: " + contador);
        });

        // Montagem da hierarquia de componentes
        painelBotoes.add(botaoClique);
        painelBotoes.add(botaoZerar);
        painelBotoes.setMaximumSize(painelBotoes.getPreferredSize());

        painelPrincipal.add(Box.createVerticalGlue());
        painelPrincipal.add(textoCliques);
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 15)));
        painelPrincipal.add(painelBotoes);
        painelPrincipal.add(Box.createVerticalGlue());

        janela.add(painelPrincipal);
        janela.setVisible(true);
    }
}

