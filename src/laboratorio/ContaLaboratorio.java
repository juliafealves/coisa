package laboratorio;

/**
 * Laboratório de Programação 2 - Lab 2
 * @author Júlia Fernandes Alves (117211383)
 * julia.alves@ccc.ufcg.edu.br
 */
public class ContaLaboratorio {
    /**
     * Limite de cota em Megabytes.
     */
    private static final int LIMITE_COTA = 2000;

    private int cota;
    private String nomeLaboratorio;

    /**
     * Construtor da Conta do Laboratório.
     * @param nomeLaboratorio
     */
    public ContaLaboratorio(String nomeLaboratorio){
        this.nomeLaboratorio = nomeLaboratorio;
    }

    /**
     * Construtor da Conta do Laboratório.
     * @param nomeLaboratorio
     * @param cota
     */
    public  ContaLaboratorio(String nomeLaboratorio, int cota){
        this.nomeLaboratorio = nomeLaboratorio;
        this.cota = cota;
    }

    /**
     * Registra o consumo de espaço no laboratório.
     * @param megabytes
     */
    public void consomeEspaco(int megabytes){
        this.cota += megabytes;
    }

    /**
     * Libera espaço no laboratório.
     * @param megabytes
     */
    public void liberaEspaco(int megabytes){
        this.cota -= megabytes;
    }

    /**
     * Verifica se o laboratório atingiu a cota.
     * @return
     */
    public boolean atingiuCota(){
        return (this.cota >= LIMITE_COTA);
    }

    /**
     * Retorna informações do laboratório formatado.
     * @return
     */
    public String toString(){
        return this.nomeLaboratorio + " " + this.cota + "/" + LIMITE_COTA;
    }
}
