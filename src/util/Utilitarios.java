package util;

import java.util.Arrays;

public class Utilitarios {
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
