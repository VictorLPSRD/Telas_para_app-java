package teste;

import javax.swing.*;

public class Registrar extends Telas {
    private JTextField campoUsuario;
    private JTextField campoSenha;
    private JTextField campoCONFSenha;
    private JTextField campoEmail;

    public void main() {
        adicionarLabelEmpilhado("Registrar", 300, 30);

        campoUsuario = new JTextField();
        adicionarInput(campoUsuario, "USUARIO", 350, 30);

        campoEmail = new JTextField();
        adicionarInput(campoEmail, "E-MAIL", 350, 30);

        campoSenha = new JPasswordField();
        adicionarInput(campoSenha, "SENHA", 350, 30);

        campoCONFSenha = new JPasswordField();
        adicionarInput(campoCONFSenha, "CONFIRMAR SENHA", 350, 30);

        adicionarBotaoEmpilhado("Registrar", 150, 30, e -> {
            String usuario = campoUsuario.getText();
            String email = campoEmail.getText();
            String senha = campoSenha.getText();
            String confSenha = campoCONFSenha.getText();

            if (usuario.isEmpty() || email.isEmpty() || senha.isEmpty() || confSenha.isEmpty()) {
                JOptionPane.showMessageDialog(janela, "Todos os campos são obrigatórios.");
            } else if (!senha.equals(confSenha)) {
                JOptionPane.showMessageDialog(janela, "As senhas não coincidem.");
            } else {
                JOptionPane.showMessageDialog(janela, "Usuário registrado com sucesso!");
            }
        });

        adicionarBotaoEmpilhado("Voltar", 150, 30, e -> voltarAoMain());
    }

    private void voltarAoMain() {
        janela.dispose();
        new Main();
    }
}