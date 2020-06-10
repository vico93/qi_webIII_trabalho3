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
        this.questoes = new String[]{"Em que ano a linguagem Java foi desenvolvida?", "Javadoc é um padrão de...", "Qual é o tipo de dado para literais?", "O que o seguinte trecho faz?\nfor (int i = 0; i < 5; i++) {\n  System.out.println(\"sim\");\n}", "Qual a extensão dos arquivos executáveis gerados pelo Java?", "Qual a diferença entre Array e ArrayList?", "O que um getter faz?", "Qual a relação entre Classe e Objeto?", "O que é um construtor?", "Quem é a professora mais bacana da QI?"};

        this.opcoes = new String[][]{{"1996","2000","2010","2018"},{"Nomenclatura de métodos","Máquina virtual Java","Documentação","Interface WEB pro Java"},{"int","double","boolean","String"},{"Crasha","Mostra sim","Mostra \"sim\" cinco vezes","Lê um caractere para a variável \"sim\""},{".exe",".applet",".jar",".bat"},{"Array é dinâmico; ArrayList é fixo","Array é fixo; ArrayList é dinâmico","Tanto Array quanto ArrayList são dinâmicos","Tanto Array quanto ArrayList são fixos"},{"Remove o dado da memória","Retorna o dado de um atributo","Altera o dado de um atributo","Altera o objeto referido"},{"Classes e objetos são padrões de métodos do Java","Objetos são valores literais","Classe é o \"molde\" o qual o Objeto se baseia","Objeto é o \"molde\" o qual a Classe se baseia"},{"Exibir os dados do objeto como String","Classe principal de um projeto Java","Método especial usado para inicializar objetos","Índice de um ArrayList"},{"Aline Zenker","Aline Zenker","Aline Zenker","Aline Zenker"}};

        this.gabarito = new byte[]{0,2,3,2,2,1,1,2,2,0};
    }

    // toString
    @Override
    public String toString() {
        String provaMontada = "";

        for (int i = 0; i < this.questoes.length; i++) {
            // Mostra a questão e a resposta correta (pega a posição da segunda coluna de acordo com o array gabarito)
            provaMontada += this.questoes[i] + "\nResp.: " + this.opcoes[i][this.gabarito[i]] + "\n";
            provaMontada += "----------------------------------------------\n";
        }

        return provaMontada;
    }
}
