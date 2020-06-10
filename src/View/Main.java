package View;

import Model.Aluno;
import Model.Prova;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Entrada
        Scanner stdin = new Scanner(System.in);

        // OBJETOS
        Aluno badanha = new Aluno();                                // Aluno
        Prova avaliacao = new Prova();                              // Prova
        byte[] opcao = new byte[avaliacao.getQuestoes().length];    // Array de opções escolhidas pelo aluno

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

                            // "Traduz" o índice das opções em letras
                            String[] letrasOpcoes = new String[]{"A)", "B)", "C)", "D)", "E)", "F)", "G)", "H)", "I)", "J)"};

                            // Loop das questões
                            for (int i = 0; i < avaliacao.getQuestoes().length; i++) {
                                // Pergunta:
                                System.out.println(letrasOpcoes[i] + " " + avaliacao.getQuestoes()[i]);
                                // Opções
                                for (int j = 0; j < avaliacao.getOpcoes()[i].length; j++) {
                                    System.out.println(j + ": " + avaliacao.getOpcoes()[i][j]);
                                }
                                opcao[i] = stdin.nextByte();
                                System.out.println("\n\n\n\n\n\n\n\n");
                            }

                            // Array temporário de escolhas alimenta o array definitivo da classe de aluno
                            badanha.setRespostas(opcao);

                            System.out.println("PROVA ENECRRADA! Pressione ENTER para prosseguir...");
                            stdin.nextLine();

                            // Bora calcular os acertos e Erros
                            System.out.println("Número de acertos: " + badanha.calcularAcertos(avaliacao.getGabarito()));
                            System.out.println("Número de erros: " + (10 - badanha.calcularAcertos(avaliacao.getGabarito())));

                            // Gabarito
                            System.out.println("Pressione ENTER para ver o gabarito...");
                            stdin.nextLine();

                            System.out.println(avaliacao);

                            // Resultado final
                            System.out.println("Resultado: " + badanha.calcularResultadoFinal(avaliacao.getGabarito()));
                            stdin.nextLine();
                            stdin.nextLine();

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
