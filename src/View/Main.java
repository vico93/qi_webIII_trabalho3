package View;

import Model.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Entrada
        Scanner stdin = new Scanner(System.in);

        // OBJETOS
        Aluno badanha = new Aluno();    // Aluno

        // Primeiro menu (cadastro OU prova)
        byte menu1;
        do {
            System.out.println("\n\n\n\n\n\n\n\n");
            System.out.println("1 - Cadastrar aluno\n2 - Visualizar cadastro de Aluno\n3 - Realizar prova\n0 - Sair");
            menu1 = stdin.nextByte();

            switch (menu1) {
                case 1:
                    System.out.println("\n\n\n\nCADASTRANDO ALUNO");

                    String nome, ra, login, senha; // #DesculpaAline

                    stdin.nextLine(); // FIX

                    System.out.print("Digite o nome do aluno: ");
                    badanha.setNome(stdin.nextLine());
                    System.out.print("Digite o RA do aluno: ");
                    badanha.setRa(stdin.nextLine());
                    System.out.print("Digite o login desejado: ");
                    badanha.setLogin(stdin.nextLine());
                    System.out.print("Digite a senha desejada: ");
                    badanha.setSenha(stdin.nextLine());

                    System.out.println("Cadastrado! Pressione ENTER para voltar ao menu principal...");
                    stdin.nextLine();

                    break;
                case 2:
                    System.out.println("\n\n\n\nCADASTRO DO ALUNO");
                    System.out.println(badanha);

                    System.out.print("Pressione ENTER para continuar...");
                    stdin.nextLine(); // FIX
                    stdin.nextLine();

                    break;
                case 3:
                    String tentaLogin, tentaSenha;    // Armazenam a tentativa de login, e #DesculpaAline

                    do {
                        System.out.println("AVALIAÇÃO DE JAVA!");

                        System.out.println("Faça o Login (ENTER se necessário)!");
                        stdin.nextLine();   // FIX

                        System.out.print("Usuário: ");
                        tentaLogin = stdin.nextLine();
                        System.out.print("Senha: ");
                        tentaSenha = stdin.nextLine();

                        // Se credenciais estiverem certas
                        if (tentaLogin.equals(badanha.getLogin()) && tentaSenha.equals(badanha.getSenha())) {
                            System.out.println("LOGADO!");
                        // SENÃO ERRO
                        } else {
                            System.out.println("ERRO! CREDENCIAIS INVÁLIDAS!");
                        }

                    } while (!(tentaLogin.equals(badanha.getLogin()) && tentaSenha.equals(badanha.getSenha())));
                    break;
                case 0:
                    System.out.println("\n\n\n\nAté mais!");
                    break;
                default:
                    System.out.println("\n\n\n\nOpção inválida! Tente novamente!");
            }
        }
        while (menu1 != 0);
    }
}
