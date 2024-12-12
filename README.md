# Estrutura de Telas Simples em Java

Este projeto fornece uma estrutura simples para criar interfaces gráficas em Java usando `javax.swing`. Ele permite acelerar o processo de criação de telas com componentes alinhados de forma empilhada (verticalmente).

## Como Usar

### 1. Configuração Inicial

Certifique-se de ter o JDK instalado e um ambiente configurado para executar programas em Java. Você pode copiar o arquivo `Telas.java` para o seu projeto ou até mesmo as telas prontas
Main, Registrar, EsqueciConta, menu.

### 2. Criando uma Janela

Para criar uma janela principal:

```java
import teste.Telas;

public class Main {
    public static void main(String[] args) {
        // Instanciar a estrutura de tela
        Telas tela = new Telas();
    }
}
```

### 3. Adicionando Componentes

#### Adicionar um Label
Adicione uma etiqueta centralizada e empilhada:

```java
    tela.adicionarLabelEmpilhado("Bem-vindo!", 200, 50);
```

#### Adicionar um Botão
Adicione um botão com ação personalizada:

```java
    tela.adicionarBotaoEmpilhado("Clique Aqui", 150, 50, e -> {
        System.out.println("Botão clicado!");
    });
```

#### Adicionar um Campo de Texto (Input)
Adicione um campo de entrada com um placeholder:

```java
    JTextField input = new JTextField();
    tela.adicionarInput(input, "Digite aqui", 200, 30);
```

### Exemplo Completo

Aqui está um exemplo de uso completo da classe `Telas`:

```java
import teste.Telas;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Telas tela = new Telas();

        tela.adicionarLabelEmpilhado("Bem-vindo ao Programa!", 300, 50);
        tela.adicionarInput(new JTextField(), "Digite seu nome", 250, 30);
        tela.adicionarBotaoEmpilhado("Enviar", 150, 50, e -> {
            System.out.println("Formulário enviado!");
        });
    }
}
```

## Funcionalidades da Classe

### Métodos

- **`adicionarLabelEmpilhado(String texto, int largura, int altura)`**: Adiciona um rótulo alinhado ao centro e empilhado verticalmente.
- **`adicionarBotaoEmpilhado(String texto, int largura, int altura, ActionListener acao)`**: Adiciona um botão com ação associada.
- **`adicionarInput(JTextField input, String placeholder, int largura, int altura)`**: Adiciona um campo de entrada com texto de placeholder e centralizado.

### Design
- **Centralizado e Empilhado:** Todos os elementos são automaticamente centralizados horizontalmente e empilhados verticalmente com espaçamento ajustado.

## Benefícios

- **Rápida Prototipagem:** Ideal para criar telas simples e rápidas.
- **Extensibilidade:** Permite adicionar mais métodos para novos componentes se necessário.

## Requisitos

- Java 8 ou superior.

## Contribuição

Sinta-se à vontade para enviar melhorias ou sugestões via pull request. Este projeto é um ponto de partida básico e pode ser expandido para atender a necessidades mais complexas.
