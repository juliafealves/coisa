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

    public Disciplina(String nome){
        this.nome = nome;
        this.horas = 0;
        this.notas = new double[QUANTIDADE_PADRAO_NOTAS];
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
        return (this.calcularMedia() >= MEDIA_APROVACAO);
    }

    /**
     * Formata as informações de disciplina.
     * @return
     */
    public String toString(){
        return this.nome + " " + this.horas + " " + this.calcularMedia() + " " + Arrays.toString(this.notas);
    }

    /**
     * Calcula a média aritméticas das notas.
     * @return
     */
    private double calcularMedia(){
        double soma = 0;

        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }

        return (soma / notas.length);
    }
}
