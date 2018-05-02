package cantina;

import util.Utilitarios;

import java.util.Arrays;

/**
 * Laboratório de Programação 2 - Lab 2
 * @author Júlia Fernandes Alves (117211383)
 * julia.alves@ccc.ufcg.edu.br
 */
public class ContaCantina {
    private String nomeCantina;
    private int quantidadeItens;
    private String[] detalhes;
    /**
     * Gasto em centavos.
     */
    private int conta;

    public ContaCantina(String nomeCantina){
        this.nomeCantina = nomeCantina;
        this.detalhes = new String[0];
    }

    /**
     * Cadastra um lanche na cantina.
     * @param quantidadeItens
     * @param valorCentavos
     */
    public void cadastraLanche(int quantidadeItens, int valorCentavos, String detalhe){
        this.quantidadeItens += quantidadeItens;
        this.conta += valorCentavos;

        if(!detalhe.isEmpty()){
           this.adicionaDetalhe(detalhe);
        }
    }

    private void adicionaDetalhe(String detalhe){
        int tamanhoDetalhe = this.detalhes.length;
        String[] detalheCopia  = Arrays.copyOf(this.detalhes, tamanhoDetalhe + 1);
        detalheCopia[tamanhoDetalhe] = detalhe;
        this.detalhes = detalheCopia;
    }

    public String listaDetalhes() {
        String listagem = "";
        String[] detalhesInverso = Utilitarios.inverter(this.detalhes);
        int limite = detalhesInverso.length;

        if(limite > 5){
            limite = 5;
        }

        for(int i = 0; i < limite; i++){
            listagem += detalhesInverso[i] + System.lineSeparator();
        }

        return listagem;
    }

    /**
     * Reduz o valor devido na conta da cantina.
     * @param valorCentavos
     */
    public void pagaConta(int valorCentavos){
        this.conta -= valorCentavos;
    }

    /**
     * Formata as informações da cantina.
     * @return
     */
    public String toString(){
        return this.nomeCantina + "  " + this.quantidadeItens + " " + this.conta;
    }
}
