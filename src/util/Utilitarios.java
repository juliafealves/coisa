package util;

import java.util.Arrays;

/**
 * Laboratório de Programação 2 - Lab 2
 * @author Júlia Fernandes Alves (117211383)
 * julia.alves@ccc.ufcg.edu.br
 *
 * Classe responsável disponibilizar métodos útils na implementação.
 */
public class Utilitarios {
    /**
     * Inverter os dados de um array sem modificar o array original.
     * @param dados Array de dados.
     * @return Novo array invertido.
     */
    public static String[] inverter(String[] dados) {
        dados = Arrays.copyOf(dados, dados.length);

        int inicio = 0;
        int fim = dados.length - 1;

        for (; inicio < fim; inicio++, fim--) {
            String auxiliar = dados[inicio];
            dados[inicio]  = dados[fim];
            dados[fim] = auxiliar;
        }

        return dados;
    }
}
