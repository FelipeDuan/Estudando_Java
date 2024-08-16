package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame {

    JTextField text;

    public Screen() {
        // Primeira Forma:
        // JFrame jFrame = new JFrame("Teste 01");

        // Criando a tela
        setTitle("Teste 01");
        setVisible(true); // deixar a tela criada visível
        setSize(800, 500); // ajuste de tamanho
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ao fechar o programa se encerra a operação
        setResizable(false); // Não permite que o usuário altere o tamanho da janela
        setLocationRelativeTo(null); // cria a janela no meio da tela

        setLayout(null);

        // Criando o JButton
        // Botão 1
        JButton jButton = new JButton("Clique aqui");
        // jButton.setText("Clique aqui"); -> colocar o texto
        jButton.setBounds(100, 200, 250, 70); // ajuste da posição e tamanho
        jButton.setFont(new Font("Arial", Font.BOLD, 40)); // qual a fonte, tipo dela, tamanho
        jButton.setForeground(new Color(241, 234, 234)); // cor da letra
        jButton.setBackground(new Color(10, 10, 10)); // cor do fundo

        add(jButton); // adiciona o button

        // Botão 2
        JButton jButton2 = new JButton("outro button");
        jButton2.setBounds(0, 0, 150, 70); // ajuste da posição e tamanho
        jButton2.setFont(new Font("Arial", Font.ITALIC, 20)); // qual a fonte, tipo dela, tamanho
        jButton2.setForeground(new Color(241, 234, 234)); // cor da letra
        jButton2.setBackground(new Color(30, 57, 184)); // cor do fundo

        //add(jButton2); // adiciona o button 2

        jButton.addActionListener(this::outroTeste); // Relacionar o Button à ação
        jButton2.addActionListener(this::teste); // Relacionar o Button à ação

        // Criando JTextField
        text = new JTextField("Clique aqui");
        text.setBounds(100, 100, 100, 100);
        text.setFont(new Font("Arial", Font.ITALIC, 40));
        text.setText("texto");

        add(text);

        setVisible(true);

    }

    private void teste(ActionEvent actionEvent) {
        System.out.println("eai"); // manda no terminal
    }

    private void outroTeste(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, text.getText(),
                "Título do JOptionPane", JOptionPane.INFORMATION_MESSAGE);
    }

}
