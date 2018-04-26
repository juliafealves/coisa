package disciplina;

import java.util.Arrays;

/**
 * Laboratório de Programação 2 - Lab 2
 * @author Júlia Fernandes Alves (117211383)
 * julia.alves@ccc.ufcg.edu.br
 */
public class Disciplina {
    private static final int QUANTIDADE_PADRAO_NOTAS = 4;
    private static final int MEDIA_APROVACAO = 7;

    private String nome;
    private int horas;
    private double[] notas;
    private int[] pesos;
    private int totalNotas;

    public Disciplina(String nome){
        this(nome, QUANTIDADE_PADRAO_NOTAS);
    }

    public Disciplina(String nome, int quantidadeNotas){
        this.nome = nome;
        this.notas = new double[quantidadeNotas];
        this.horas = 0;
    }

    public Disciplina(String nome, int quantidadeNotas, int[] pesos){
        this(nome, quantidadeNotas);
        this.pesos = pesos;
    }

    /**
     * Cadastra a quantidade de horas de estudo na disciplina.
     * @param horas
     */
    public void cadastraHoras(int horas){
        this.horas += horas;
    }

    /**
     * Cadastra o valor da nota do aluno.
     * @param nota
     * @param valor
     */
    public void cadastraNota(int nota, double valor){
        this.notas[nota - 1] = valor;
    }

    public boolean aprovado(){
        return (this.calculaMedia() >= MEDIA_APROVACAO);
    }

    /**
     * Formata as informações de disciplina.
     * @return
     */
    public String toString(){
        return this.nome + " " + this.horas + " " + this.calculaMedia() + " " + Arrays.toString(this.notas);
    }

    /**
     * Calcula a média das notas da disciplina.
     * @return
     */
    private double calculaMedia(){
        if(this.pesos.length == 0){
            return this.calculaMediaAritmetica();
        }else{
            return this.calculaMediaPonderada();
        }
    }

    private double calculaMediaAritmetica(){
        double soma = 0;

        for(int i = 0; i < this.notas.length; i++){
            soma += this.notas[i];
        }

        return (soma / notas.length);
    }

    private double calculaMediaPonderada(){
        double soma = 0;

        for(int i = 0; i < this.notas.length; i++){
            soma += this.notas[i] * this.pesos[i];
        }

        return (soma / 10);
    }
}
