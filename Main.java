package teste;

import javax.swing.*;

public class Main extends Telas {
    private JTextField campoUsuario;
    private JTextField campoSenha;

    public Main() {
        adicionarLabelEmpilhado("Bem-vindo à tela principal!", 300, 30);
        adicionarLabelEmpilhado("LOGIN:", 300, 30);

        campoUsuario = new JTextField();
        adicionarInput(campoUsuario, "USUARIO", 350, 30);

        campoSenha = new JPasswordField();
        adicionarInput(campoSenha, "SENHA", 350, 30);

        // Primeiro botão
        adicionarBotaoEmpilhado("Entrar", 150, 30, e -> {
            String usuario = campoUsuario.getText();
            String senha = campoSenha.getText();

            if (usuario.equals("Victor") && senha.equals("123")) {
                JOptionPane.showMessageDialog(janela, "Você entrou!");
               menu menu = new menu();
			menu.main();
            } else {
                JOptionPane.showMessageDialog(janela, "Usuário ou senha incorretos.");
            }
        });

        // Segundo botão
        adicionarBotaoEmpilhado("Registrar", 150, 30, e -> new Registrar().main());

        // Terceiro botão
        adicionarBotaoEmpilhado("Esqueci a senha", 150, 30, e -> new EsqueciConta().main());
    }

    public static void main(String[] args) {
        new Main();
    }
}
