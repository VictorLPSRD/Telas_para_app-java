package teste;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends Telas {
    public void main() {
        // Primeiro botão
        adicionarBotaoEmpilhado("Opção 1", 150, 30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aqui você pode adicionar a lógica para o botão "Entrar"
            }
        });

        // Segundo botão
        adicionarBotaoEmpilhado("Opção 2", 150, 30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abre a tela Registrar
            }
        });
        
        // Terceiro botão
        adicionarBotaoEmpilhado("Opção 3", 150, 30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abre a tela Registrar
            }
        });
        
        // Botão Sair
        adicionarBotaoEmpilhado("Sair", 150, 30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Encerra a aplicação
            }
        });
    }
}
