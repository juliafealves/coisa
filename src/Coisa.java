import cantina.ContaCantina;
import disciplina.Disciplina;
import laboratorio.ContaLaboratorio;
import saude.Saude;

/**
 * Laboratório de Programação 2 - Lab 2
 * @author Júlia Fernandes Alves (117211383)
 * julia.alves@ccc.ufcg.edu.br
 */
public class Coisa {
    public static void main(String[] args) {
        /**
         * Manipula as informações referente a conta de laboratório.
         */
        ContaLaboratorio contaLCC2 = new ContaLaboratorio("LCC2");
        contaLCC2.consomeEspaco(1999);
        System.out.println(contaLCC2.atingiuCota());
        contaLCC2.consomeEspaco(2);
        System.out.println(contaLCC2.atingiuCota());
        contaLCC2.liberaEspaco(1);
        System.out.println(contaLCC2.atingiuCota());
        contaLCC2.liberaEspaco(1);
        System.out.println(contaLCC2.atingiuCota());
        System.out.println(contaLCC2.toString());
        /**
         * Manipula as informações referente a disciplina.
         */
        Disciplina prog2 = new Disciplina("PROGRAMACAO 2");
        prog2.cadastraHoras(4);
        prog2.cadastraNota(1, 5.0);
        prog2.cadastraNota(2, 6.0);
        prog2.cadastraNota(3, 7.0);
        System.out.println(prog2.aprovado());
        prog2.cadastraNota(4, 10.0);
        System.out.println(prog2.aprovado());
        System.out.println(prog2.toString());

        /**
         * Manipulas as informações referente a saúde
         */
        Saude saude = new Saude();
        System.out.println(saude.getStatusGeral());
        saude.defineSaudeMental("boa");
        saude.defineSaudeFisica("boa");
        System.out.println(saude.getStatusGeral());
        saude.defineSaudeMental("fraca");
        saude.defineSaudeFisica("fraca");
        System.out.println(saude.getStatusGeral());
        saude.defineEmoji("=)");
        System.out.println(saude.getStatusGeral());
        saude.defineSaudeMental("boa");
        saude.defineSaudeFisica("fraca");
        System.out.println(saude.getStatusGeral());
        /**
         * Manipula as informações de conta da cantina.
         */
        ContaCantina mulherDoBolo = new ContaCantina("Mulher do Bolo");
        mulherDoBolo.cadastraLanche(2, 500, null);
        mulherDoBolo.cadastraLanche(1, 500, null);
        mulherDoBolo.pagaConta(200);
        System.out.println(mulherDoBolo.toString());

        ContaCantina cantina = new ContaCantina("Dona Florzinha");
        cantina.cadastraLanche(10, 500, "Lanche da tarde");
        cantina.cadastraLanche(3, 200, "Café da manhã");
        cantina.cadastraLanche(2, 50, "Balas");
        cantina.cadastraLanche(5, 250, "Cuzcuz do mal");
        cantina.cadastraLanche(1, 100, "Bolo de cueca");
        cantina.cadastraLanche(4, 150, "Arroz de Leite");
        System.out.println(cantina.listaDetalhes());

    }
}
