package laboratorio;

/**
 * Laboratório de Programação 2 - Lab 2
 *
 * @author Júlia Fernandes Alves (117211383)
 * julia.alves@ccc.ufcg.edu.br
 * <p>
 * Classe responsável por gerenciar a Conta de Laboratório, a qual é responsável por manter o registro da quantidade de
 * espaço utilizado em determinado laboratório.
 */
public class ContaLaboratorio {
    /**
     * Limite de cota em Megabytes.
     */
    private static final int LIMITE_COTA = 2000;
    /**
     * Contabiliza a cota utilizada no laboratório.
     */
    private int cota;
    /**
     * Nome único do laboratório.
     */
    private String nomeLaboratorio;

    /**
     * Método do construtor da Conta do Laboratório.
     *
     * @param nomeLaboratorio Nome do Laboratório
     */
    public ContaLaboratorio(String nomeLaboratorio) {
        this.nomeLaboratorio = nomeLaboratorio;
    }

    /**
     * Método do construtor da Conta do Laboratório.
     *
     * @param nomeLaboratorio Nome do Laboratório deve ser único.
     * @param cota            Quantidade de cota utilizado.
     */
    public ContaLaboratorio(String nomeLaboratorio, int cota) {
        this.nomeLaboratorio = nomeLaboratorio;
        this.cota = cota;
    }

    /**
     * Retorna o nome do laborário.
     *
     * @return String corresponde ao nome do laboratório.
     */
    public String getNomeLaboratorio() {
        return this.nomeLaboratorio;
    }

    /**
     * Registra o consumo de espaço no laboratório.
     *
     * @param megabytes Tamanho do consumo de espaço em Megabyte.
     */
    public void consomeEspaco(int megabytes) {
        this.cota += megabytes;
    }

    /**
     * Libera espaço no laboratório.
     *
     * @param megabytes Tamanho do consumo de espaço em Megabyte.
     */
    public void liberaEspaco(int megabytes) {
        this.cota -= megabytes;
    }

    /**
     * Verifica se a conta do usuário atingiu a cota de consumo.
     *
     * @return
     */
    public boolean atingiuCota() {
        return (this.cota >= LIMITE_COTA);
    }

    /**
     * Retorna informações do laboratório formatado para uso.
     *
     * @return Incluindo (Nome do laboratório, conta e limte de cota)
     */
    public String toString() {
        return this.nomeLaboratorio + " " + this.cota + "/" + LIMITE_COTA;
    }
}
