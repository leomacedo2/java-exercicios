// Formulario.java
package ExercicioExtra_Formulario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Formulário de Pessoa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(380, 220);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(6, 8, 6, 8);
        c.fill = GridBagConstraints.HORIZONTAL;

        // Nome
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0;
        panel.add(new JLabel("Nome:"), c);

        JTextField nomeField = new JTextField();
        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 1.0;
        panel.add(nomeField, c);

        // Idade
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 0;
        panel.add(new JLabel("Idade:"), c);

        JTextField idadeField = new JTextField();
        idadeField.setColumns(4);
        c.gridx = 1;
        c.gridy = 1;
        c.weightx = 0.2;
        panel.add(idadeField, c);

        // Buttons panel
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.RIGHT, 8, 0));
        JButton limparButton = new JButton("Limpar");
        JButton enviarButton = new JButton("Enviar");
        buttons.add(limparButton);
        buttons.add(enviarButton);

        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        c.weightx = 0;
        panel.add(buttons, c);

        // Ações
        limparButton.addActionListener(e -> {
            nomeField.setText("");
            idadeField.setText("");
            nomeField.requestFocusInWindow();
        });

        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText() != null ? nomeField.getText().trim() : "";
                String idadeText = idadeField.getText() != null ? idadeField.getText().trim() : "";

                // Validações
                if (nome.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Por favor, insira o nome.", "Erro", JOptionPane.ERROR_MESSAGE);
                    nomeField.requestFocusInWindow();
                    return;
                }
                if (nome.length() > 50) {
                    JOptionPane.showMessageDialog(frame, "Nome muito longo (máx. 50 caracteres).", "Erro", JOptionPane.ERROR_MESSAGE);
                    nomeField.requestFocusInWindow();
                    return;
                }

                int idade;
                try {
                    idade = Integer.parseInt(idadeText);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Idade inválida. Por favor, insira um número inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
                    idadeField.requestFocusInWindow();
                    return;
                }
                if (idade < 0 || idade > 150) {
                    JOptionPane.showMessageDialog(frame, "Idade fora do intervalo esperado (0-150).", "Erro", JOptionPane.ERROR_MESSAGE);
                    idadeField.requestFocusInWindow();
                    return;
                }

                Pessoa pessoa = new Pessoa(nome, idade);
                int option = JOptionPane.showConfirmDialog(frame, "Pessoa criada:\n" + pessoa.apresentar() + "\n\nDeseja limpar os campos?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    limparButton.doClick();
                }
            }
        });

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

}
