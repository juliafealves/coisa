package aluno;

import cantina.ContaCantina;
import disciplina.Disciplina;
import laboratorio.ContaLaboratorio;
import saude.Saude;

/**
 * Laboratório de Programação 2 - Lab 2
 * @author Júlia Fernandes Alves (117211383)
 * julia.alves@ccc.ufcg.edu.br
 *
 * Classe responsável por implementar todas as ações de Aluno.
 */
public class Aluno {
    ContaCantina[] contasCantina;
    ContaLaboratorio[] contasLaborarios;
    Disciplina[] disciplinas;
    Saude saude;

    public Aluno() {
        contasLaborarios = new ContaLaboratorio[50];
        disciplinas = new Disciplina[50];
        contasCantina = new ContaCantina[50];
        saude = new Saude();
    }

    public void cadastraLaboratorio(String nomeLaboratorio) {
        int tamanho = this.contasLaborarios.length;
        this.contasLaborarios[tamanho] = new ContaLaboratorio(nomeLaboratorio);
    }

    public void cadastraLaboratorio(String nomeLaboratorio, int cota) {
        int tamanho = this.contasLaborarios.length;
        this.contasLaborarios[tamanho] = new ContaLaboratorio(nomeLaboratorio, cota);
    }

    public void consomeEspaco(String nomeLaboratorio, int megabytes) {
        int index = localizaContaLaboratorio(nomeLaboratorio);
        this.contasLaborarios[index].consomeEspaco(megabytes);
    }

    public void liberaEspaco(String nomeLaboratorio, int megabytes) {
        int index = localizaContaLaboratorio(nomeLaboratorio);
        this.contasLaborarios[index].liberaEspaco(megabytes);
    }

    public boolean atingiuCota(String nomeLaboratorio) {
        int index = localizaContaLaboratorio(nomeLaboratorio);
        return this.contasLaborarios[index].atingiuCota();
    }

    public String laboratorioToString(String nomeLaboratorio) {
        int index = localizaContaLaboratorio(nomeLaboratorio);
        return this.contasLaborarios[index].toString();
    }

    public void cadastraDisciplina(String nomeDisciplina) {
        int tamanho = this.disciplinas.length;
        this.disciplinas[tamanho] = new Disciplina(nomeDisciplina);
    }

    public void cadastraHoras(String nomeDisciplina, int horas) {
        int index = this.localizaDisciplina(nomeDisciplina);
        this.disciplinas[index].cadastraHoras(horas);
    }

    public void cadastraNota(String nomeDisciplina, int nota, double valorNota) {
        int index = this.localizaDisciplina(nomeDisciplina);
        this.disciplinas[index].cadastraNota(nota, valorNota);
    }

    public boolean aprovado(String nomeDisciplina) {
        int index = this.localizaDisciplina(nomeDisciplina);
        return this.disciplinas[index].aprovado();
    }

    public String disciplinaToString(String nomeDisciplina) {
        int index = this.localizaDisciplina(nomeDisciplina);
        return this.disciplinas[index].toString();
    }

    public void cadastraCantina(String nomeCantina) {
        int tamanho = this.contasCantina.length;
        this.contasCantina[tamanho] = new ContaCantina(nomeCantina);
    }

    public void cadastraLanche(String nomeCantina, int quantidadeItens, int valorCentavos) {
        int index = this.localizaContaCantina(nomeCantina);
        this.contasCantina[index].cadastraLanche(quantidadeItens, valorCentavos, null);
    }

    public void pagarConta(String nomeCantina, int valorCentavos) {
        int index = this.localizaContaCantina(nomeCantina);
        this.contasCantina[index].pagaConta(valorCentavos);
    }

    public String cantinaToString(String nomeCantina) {
        int index = this.localizaContaCantina(nomeCantina);
        return this.contasCantina[index].toString();
    }

    public void defineSaudeMental(String valor) {
        this.saude.defineSaudeMental(valor);
    }

    public void defineSaudeFisica(String valor) {
        this.saude.defineSaudeFisica(valor);
    }

    public String getStatusGeral() {
        return this.saude.getStatusGeral();
    }

    private int localizaContaLaboratorio(String nomeLaboratorio) {
        for (int i = 0; i < this.contasLaborarios.length; i++) {
            if (this.contasLaborarios[i].getNomeLaboratorio().equals(nomeLaboratorio)) {
                return i;
            }
        }

        return -1;
    }

    private int localizaDisciplina(String nomeDisciplina) {
        for (int i = 0; i < this.disciplinas.length; i++) {
            if (this.disciplinas[i].getNome().equals(nomeDisciplina)) {
                return i;
            }
        }

        return -1;
    }

    private int localizaContaCantina(String nomeCantina) {
        for (int i = 0; i < this.contasCantina.length; i++) {
            if (this.contasCantina[i].getNomeCantina().equals(nomeCantina)) {
                return i;
            }
        }

        return -1;
    }
}
