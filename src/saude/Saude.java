package saude;

/**
 * Laboratório de Programação 2 - Lab 2
 *
 * @author Júlia Fernandes Alves (117211383)
 * julia.alves@ccc.ufcg.edu.br
 * <p>
 * Classe responsável por gerenciar a saúde física e mental de um Aluno.
 */
public class Saude {
    private static final String SAUDE_BOA = "boa";
    private static final String SAUDE_FRACA = "fraca";
    private static final String SAUDE_OK = "ok";

    /**
     * Representa a saúde mental do aluno.
     */
    private String mental;
    /**
     * Representa a saúde física do aluno.
     */
    private String fisica;
    /**
     * Representa o emoji para representar a saúde geral do aluno.
     */
    private String emoji;

    /**
     * Constrói o objeto Saúde. Definindo inicialmente as saúdes física e mental como "boa".
     */
    public Saude() {
        this.mental = SAUDE_BOA;
        this.fisica = SAUDE_BOA;
    }

    /**
     * Define o valor da saúde mental, aceitando os valores "boa" e "fraca".
     *
     * @param valor Valor deverá ser "boa" ou "fraca".
     */
    public void defineSaudeMental(String valor) {
        this.mental = valor;
        this.emoji = null;
    }

    /**
     * Define o valor da saúde física, aceitando os valores "boa" e "fraca".
     *
     * @param valor Valor deverá ser "boa" ou "fraca".
     */
    public void defineSaudeFisica(String valor) {
        this.fisica = valor;
        this.emoji = null;
    }

    /**
     * Define um emoji para representar a saúde geral do aluno.
     *
     * @param emoji Emoji que poderá ser de diversos formatos, por exemplo :) =(
     */
    public void defineEmoji(String emoji) {
        this.emoji = emoji;
        this.fisica = null;
        this.mental = null;
    }

    /**
     * Retorna a situação geral da saúde do aluno.
     * Caso as saúdes mental e física estejam fracas, a saúde geral do aluno é “fraca”. Se ambas estiverem boas, a saúde
     * geral é “boa”. Se uma delas estiver fraca, mas a outra estiver boa, a saúde geral é considerada “ok”.
     *
     * @return Situação geral podendo ser "boa", "fraca" ou "ok".
     */
    public String getStatusGeral() {
        String saudeGeral;

        if (this.emoji != null) {
            saudeGeral = this.emoji;
        } else if (this.mental.equals(SAUDE_BOA) && this.fisica.equals(SAUDE_BOA)) {
            saudeGeral = SAUDE_BOA;
        } else if (this.mental.equals(SAUDE_FRACA) && this.fisica.equals(SAUDE_FRACA)) {
            saudeGeral = SAUDE_FRACA;
        } else {
            saudeGeral = SAUDE_OK;
        }

        return saudeGeral;
    }
}
