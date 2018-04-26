package cantina;

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

    /**
     * @// TODO: 26/04/18 Concluir listagem.
     * @return
     */
    public String listaDetalhes() {
        String listagem = "";
        int tamanhoDetalhe = this.detalhes.length;
        int contador = 0;

        for(int i = tamanhoDetalhe - 1; i < tamanhoDetalhe - 6; i--){
            listagem += this.detalhes[i] + System.lineSeparator();
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
