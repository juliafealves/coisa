package cantina;

import util.Utilitarios;

import java.util.Arrays;

/**
 * Laboratório de Programação 2 - Lab 2
 *
 * @author Júlia Fernandes Alves (117211383)
 * julia.alves@ccc.ufcg.edu.br
 * <p>
 * Classe responsável por gerenciar os gastos de uma cantina.
 */
public class ContaCantina {
    /**
     * Nome da cantina.
     */
    private String nomeCantina;
    /**
     * Quantidade itens consumidos na cantina.
     */
    private int quantidadeItens;
    /**
     * Registros de detalhes referente aos lanches consumidos na cantina.
     */
    private String[] detalhes;
    /**
     * Gasto em centavos.
     */
    private int conta;

    /**
     * Método construtor responsável por criar um objeto ContaCantina.
     *
     * @param nomeCantina Nome da Cantina deve ser único.
     */
    public ContaCantina(String nomeCantina) {
        this.nomeCantina = nomeCantina;
        this.detalhes = new String[0];
    }

    /**
     * Retorna o nome da cantina.
     *
     * @return Nome da cantina.
     */
    public String getNomeCantina() {
        return this.nomeCantina;
    }

    /**
     * Cadastra um lanche na cantina.
     *
     * @param quantidadeItens Quantidade de itens consumidos.
     * @param valorCentavos   Gasto em centavos no lanche consumido.
     * @param detalhe         Descrição detalhada do consumo, opcional.
     */
    public void cadastraLanche(int quantidadeItens, int valorCentavos, String detalhe) {
        this.quantidadeItens += quantidadeItens;
        this.conta += valorCentavos;

        if (!(detalhe == null || detalhe.isEmpty())) {
            this.adicionaDetalhe(detalhe);
        }
    }

    /**
     * Adiciona um detalhe na lista de detalhes para manter um histórico de consumo.
     *
     * @param detalhe Descrição detalhada do consumo.
     */
    private void adicionaDetalhe(String detalhe) {
        int tamanhoDetalhe = this.detalhes.length;
        String[] detalheCopia = Arrays.copyOf(this.detalhes, tamanhoDetalhe + 1);
        detalheCopia[tamanhoDetalhe] = detalhe;
        this.detalhes = detalheCopia;
    }

    /**
     * Lista os últimos 5 detalhes de lanches, em ordem cronológico do mais recente ao mais antigo.
     *
     * @return Listagem dos detalhes de lanches consumidos.
     */
    public String listaDetalhes() {
        String listagem = "";
        String[] detalhesInverso = Utilitarios.inverter(this.detalhes);
        int limite = detalhesInverso.length;

        if (limite > 5) {
            limite = 5;
        }

        for (int i = 0; i < limite; i++) {
            listagem += detalhesInverso[i] + System.lineSeparator();
        }

        return listagem;
    }

    /**
     * Reduz o valor devido na conta da cantina.
     *
     * @param valorCentavos Pagamento em centavos dos lanches consumidos.
     */
    public void pagaConta(int valorCentavos) {
        this.conta -= valorCentavos;
    }

    /**
     * Formata as informações da cantina.
     *
     * @return Nome da cantina, quantidade de itens e conta.
     */
    public String toString() {
        return this.nomeCantina + "  " + this.quantidadeItens + " " + this.conta;
    }
}
