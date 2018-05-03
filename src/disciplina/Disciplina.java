package disciplina;

import java.util.Arrays;

/**
 * Laboratório de Programação 2 - Lab 2
 *
 * @author Júlia Fernandes Alves (117211383)
 * julia.alves@ccc.ufcg.edu.br
 * <p>
 * Classe responsável por gerenciar as notas e horas de estudos do aluno em uma disciplina.
 */
public class Disciplina {
    /**
     * Quantidade padrão de notas por disciplina.
     */
    private static final int QUANTIDADE_PADRAO_NOTAS = 4;
    /**
     * Média de aprovação para ser aprovados na disciplina.
     */
    private static final int MEDIA_APROVACAO = 7;
    /**
     * Nome da disciplina
     */
    private String nome;
    /**
     * Registro de horas de estudos
     */
    private int horas;
    /**
     * Registro das notas da disciplina.
     */
    private double[] notas;
    /**
     * Registro dos pesos das notas da disciplina.
     * Atributo opcional.
     */
    private int[] pesos;
    /**
     * Total de notas, quando desconsiderado o valor padrão de 4 notas por disciplina.
     * Opcional.
     */
    private int totalNotas;

    /**
     * Método construtor de Disciplina considerando apenas o nome.
     * Nome da disciplina é único.
     *
     * @param nome Nome da Disciplina, valor único.
     */
    public Disciplina(String nome) {
        this(nome, QUANTIDADE_PADRAO_NOTAS);
    }

    /**
     * Método construtor de Disciplina incluindo a possibilidade de definir a quantidade de notas.
     *
     * @param nome            Nome da Disciplina, valor único.
     * @param quantidadeNotas Quantidade de notas da disciplina, podendo ser diferente do padrão de 4 notas.
     */
    public Disciplina(String nome, int quantidadeNotas) {
        this.nome = nome;
        this.notas = new double[quantidadeNotas];
        this.horas = 0;
    }

    /**
     * Método construtor de Disciplina incluindo a possibilidade de definir a quantidade de notas, e os pessoas de cada
     * nota. A quantidade notas deve corresponder a quantidade de pesos.
     *
     * @param nome            Nome da Disciplina, valor único.
     * @param quantidadeNotas
     * @param pesos
     */
    public Disciplina(String nome, int quantidadeNotas, int[] pesos) {
        this(nome, quantidadeNotas);
        this.pesos = pesos;
    }

    /**
     * Retorna o nome da disciplina.
     *
     * @return Nome da disciplina.
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Cadastra a quantidade de horas de estudo na disciplina.
     *
     * @param horas Quantidade de horas em valor inteiro.
     */
    public void cadastraHoras(int horas) {
        this.horas += horas;
    }

    /**
     * Cadastra o valor da nota do aluno.
     *
     * @param nota  Identificador da nota, iniciando por 1.
     * @param valor Valor da nota.
     */
    public void cadastraNota(int nota, double valor) {
        this.notas[nota - 1] = valor;
    }

    /**
     * Verifica se o aluno foi aprovado ou não por média.
     *
     * @return
     */
    public boolean aprovado() {
        return (this.calculaMedia() >= MEDIA_APROVACAO);
    }

    /**
     * Formata as informações de disciplina.
     *
     * @return Nome da disciplina, horas, média e notas.
     */
    public String toString() {
        return this.nome + " " + this.horas + " " + this.calculaMedia() + " " + Arrays.toString(this.notas);
    }

    /**
     * Calcula a média das notas da disciplina, podendo ser média aritmética, caso não seja definido os pesos das notas,
     * ou média ponderada de acordo com os pesos das notas.
     *
     * @return Média das notas da disciplina.
     */
    private double calculaMedia() {
        if (this.pesos == null) {
            return this.calculaMediaAritmetica();
        } else {
            return this.calculaMediaPonderada();
        }
    }

    /**
     * Realiza o cálculo da média artimética.
     *
     * @return Média aritmética das notas do aluno.
     */
    private double calculaMediaAritmetica() {
        double soma = 0;

        for (int i = 0; i < this.notas.length; i++) {
            soma += this.notas[i];
        }

        return (soma / notas.length);
    }

    /**
     * Realiza o cálculo ponderado da média, é considerado os pesos de cada nota.
     *
     * @return Média ponderada das notas do aluno.
     */
    private double calculaMediaPonderada() {
        double soma = 0;

        for (int i = 0; i < this.notas.length; i++) {
            soma += this.notas[i] * this.pesos[i];
        }

        return (soma / 10);
    }
}
