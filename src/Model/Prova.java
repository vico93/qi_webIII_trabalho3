package Model;

public class Prova {
    // Atributos
    private String[] questoes;  // Array com as questões
    private String[][] opcoes;  // Primeira coluna = numero da questão; Segunda coluna = as quatro opções
    private byte[] gabarito;    // Array que armazena, em cada posição (questão) a "ID" da opção certa (posição na segunda coluna de opcoes

    // Acessores
    public String[] getQuestoes() {
        return questoes;
    }
    public void setQuestoes(String[] questoes) {
        this.questoes = questoes;
    }
    public String[][] getOpcoes() {
        return opcoes;
    }
    public void setOpcoes(String[][] opcoes) {
        this.opcoes = opcoes;
    }
    public byte[] getGabarito() {
        return gabarito;
    }
    public void setGabarito(byte[] gabarito) {
        this.gabarito = gabarito;
    }

    // Construtor
    public Prova() {
        this.questoes = new String[20];
        this.opcoes = new String[20][4];
        this.gabarito = new byte[20];

        // COLOCAR AQUI AS QUESTÕES, OPÇÕES E GABARITO
    }

    // toString
    @Override
    public String toString() {
        String provaMontada = "";

        for (int i = 0; i < this.questoes.length; i++) {
            // Mostra a questão e a resposta correta (pega a posição da segunda coluna de acordo com o array gabarito)
            provaMontada += this.questoes[i] + "\nResp.:" + this.opcoes[i][this.gabarito[i]] + "\n";
        }

        return provaMontada;
    }
}
