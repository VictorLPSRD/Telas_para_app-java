// Pacote principal
package teste;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

// Classe principal para criação de telas
public class Telas {
    protected JFrame janela;
    protected JPanel painel;

    // Variável para controlar a posição vertical dos elementos
    private int posicaoVertical = 0;

    public Telas() {
        // Obtém o tamanho da tela
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;

        // Criando a janela principal
        janela = new JFrame("Tela Simples em Java");
        janela.setSize(width, height);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criando um painel com layout null
        painel = new JPanel(null);
        janela.add(painel);

        // Exibindo a janela
        janela.setVisible(true);
    }

    public void adicionarLabelEmpilhado(String texto, int largura, int altura) {
        JLabel label = new JLabel(texto, SwingConstants.CENTER);
        label.setSize(largura, altura);

        int x = (janela.getWidth() - largura) / 2;

        if (posicaoVertical == 0) {
            posicaoVertical = (janela.getHeight() - altura) / 2;
        }
        label.setLocation(x, posicaoVertical);

        painel.add(label);
        posicaoVertical += altura + 10;

        painel.revalidate();
        painel.repaint();
    }

    public void adicionarBotaoEmpilhado(String texto, int largura, int altura, ActionListener acao) {
        JButton botao = new JButton(texto);
        botao.setSize(largura, altura);

        int x = (janela.getWidth() - largura) / 2;

        if (posicaoVertical == 0) {
            posicaoVertical = (janela.getHeight() - altura) / 2;
        }
        botao.setLocation(x, posicaoVertical);

        painel.add(botao);
        posicaoVertical += altura + 10;

        botao.addActionListener(acao);

        painel.setPreferredSize(new Dimension(janela.getWidth(), posicaoVertical + 50));
        painel.revalidate();
        painel.repaint();
    }

    public void adicionarInput(JTextField input, String placeholder, int largura, int altura) {
        input.setSize(largura, altura);
        input.setHorizontalAlignment(SwingConstants.CENTER);

        int x = (janela.getWidth() - largura) / 2;

        if (posicaoVertical == 0) {
            posicaoVertical = (janela.getHeight() - altura) / 2;
        }

        input.setLocation(x, posicaoVertical);

        input.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (input.getText().equals(placeholder)) {
                    input.setText("");
                    input.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (input.getText().isEmpty()) {
                    input.setText(placeholder);
                    input.setForeground(Color.GRAY);
                }
            }
        });

        input.setText(placeholder);
        input.setForeground(Color.GRAY);

        painel.add(input);
        posicaoVertical += altura + 15;

        painel.revalidate();
        painel.repaint();
    }
}