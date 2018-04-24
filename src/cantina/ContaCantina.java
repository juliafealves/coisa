package cantina;

/**
 * Laboratório de Programação 2 - Lab 2
 * @author Júlia Fernandes Alves (117211383)
 * julia.alves@ccc.ufcg.edu.br
 */
public class ContaCantina {
    private String nomeCantina;
    private int quantidadeItens;
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
    public void cadastraLanche(int quantidadeItens, int valorCentavos){
        this.quantidadeItens += quantidadeItens;
        this.conta += valorCentavos;
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
