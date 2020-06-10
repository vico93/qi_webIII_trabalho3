package Model;

import java.util.Arrays;

public class Aluno {
    // Atributos
    private String nome;
    private String ra;
    private String login;
    private String senha;
    private byte[] respostas;

    // Acessores
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRa() {
        return ra;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public byte[] getRespostas() {
        return respostas;
    }
    public void setRespostas(byte[] respostas) {
        this.respostas = respostas;
    }

    // Construtor
    public Aluno() {
        this.respostas = new byte[10];  // Array VAZIO! Será preenchido depois
    }

    // Métodos
    public int calcularAcertos(byte[] gabarito) {
        int acum = 0;

        for (int i = 0; i < respostas.length; i++) {
            if (respostas[i] == gabarito[i]) {
                acum++;
            }
        }
        return acum;
    }

    public String calcularResultadoFinal(byte[] gabarito){
        int acertos = this.calcularAcertos(gabarito);
        String textoResultado = "";

        if ((acertos >= 2) && (acertos <= 5)) {
            textoResultado = "Aluno em Recuperação";
        }
        else if ((acertos >= 6) && (acertos <= 9)) {
            textoResultado = "Aluno aprovado";
        }
        else if (acertos >= 10) {
            textoResultado = "Aluno aprovado COM LÁUREA ACADÊMICA";
        }
        else {
            textoResultado = "Reprovado";
        }

        return textoResultado;
    }

    // toString
    @Override
    public String toString() {
        return "Aluno: " + nome +
                "\nRA: " + ra +
                "\nUsuário: " + login;
    }
}
