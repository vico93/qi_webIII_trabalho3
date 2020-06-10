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
        this.respostas = new byte[20];  // Array VAZIO! Será preenchido depois
    }


    // Métodos


    // toString
    @Override
    public String toString() {
        return "Aluno: " + nome +
                "\nRA: " + ra +
                "\nUsuário: " + login;
    }
}
