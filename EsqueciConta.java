package teste;

import javax.swing.*;

public class EsqueciConta extends Telas {
    private JTextField emailRecuperacao;

    public void main() {
        adicionarLabelEmpilhado("Recuperar conta", 300, 30);
        adicionarLabelEmpilhado("Informe seu email abaixo:", 300, 30);

        emailRecuperacao = new JTextField();
        adicionarInput(emailRecuperacao, "E-MAIL", 350, 30);

        adicionarBotaoEmpilhado("Enviar", 150, 30, e -> {
            JOptionPane.showMessageDialog(janela, "Email enviado para: " + emailRecuperacao.getText());
        });

        adicionarBotaoEmpilhado("Voltar", 150, 30, e -> voltarAoMain());
    }

    private void voltarAoMain() {
        janela.dispose();
        new Main();
    }
}
