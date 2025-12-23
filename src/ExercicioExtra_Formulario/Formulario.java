// Formulario.java
package ExercicioExtra_Formulario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulário de Pessoa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);
        frame.setLayout(null);

        // Label nome
        JLabel nomeLabel = new JLabel("Nome:");
        nomeLabel.setBounds(30, 30, 80, 25);
        frame.add(nomeLabel);

        // Campo nome
        JTextField nomeField = new JTextField();
        nomeField.setBounds(100, 30, 170, 25);
        frame.add(nomeField);

        // Label idade
        JLabel idadeLabel = new JLabel("Idade:");
        idadeLabel.setBounds(30, 70, 80, 25);
        frame.add(idadeLabel);

        // Campo idade
        JTextField idadeField = new JTextField();
        idadeField.setBounds(100, 70, 40, 25);
        frame.add(idadeField);

        // Botão enviar
        JButton enviarButton = new JButton("Enviar");
        enviarButton.setBounds(100, 120, 100, 30);
        frame.add(enviarButton);

        // Ação do botão
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                int idade;
                try {
                    idade = Integer.parseInt(idadeField.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Idade inválida. Por favor, insira um número.");
                    return;
                }

                Pessoa pessoa = new Pessoa(nome, idade);
                JOptionPane.showMessageDialog(frame, "Pessoa criada:\n" + pessoa.apresentar());
            }
        });

        frame.setVisible(true);
    }
    
}
