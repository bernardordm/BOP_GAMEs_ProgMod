package Components;

import java.util.ArrayList;
import java.util.List;

public class Ciclista {
    private int codigoCiclista;
    private String nome;
    private String cidadeDoCiclista;
    private List<Etapa> etapas;

    // Getters e Setters
    public int getNumero() {
        return codigoCiclista;
    }

    public String getNome() {
        return nome;
    }

    public String getCidadeDeOrigem() {
        return cidadeDoCiclista;
    }

    public List<Etapa> getEtapas() {
        return etapas;
    }


    // Construtor
    public Ciclista(int numero, String nome, String cidadeDeOrigem) {
        this.codigoCiclista = numero;
        this.nome = nome;
        this.cidadeDoCiclista = cidadeDeOrigem;
        this.etapas = new ArrayList<>();
    }

    //Metodos

    // Adiciona uma etapa à lista de etapas do ciclista
    public void adicionarEtapa(Etapa etapa) {
        if (etapas.size() < 21) {
            etapas.add(etapa);
        } else {
            throw new IllegalArgumentException("Erro: O ciclista ja possui 21 etapas cadastradas !");
        }
    }

    // Calcula o tempo total de todas as etapas do ciclista
    public int getTempoTotal() {
        int tempoTotal = 0;
        for (Etapa etapa : etapas) {
            tempoTotal += etapa.getTempo();
        }
        return tempoTotal;
    }

    // Compara o tempo total de dois ciclistas
    public int compararCiclistas(Ciclista outroCiclista) {
        return this.getTempoTotal() - outroCiclista.getTempoTotal();
    }

    // Compara a mesma etapa entre dois ciclistas
    public int compararEtapa(int numeroEtapa, Ciclista outroCiclista) {
        if (numeroEtapa < 0 || numeroEtapa >= 21) {
            throw new IllegalArgumentException("Erro: Número de etapa inválido");
        }
        Etapa minhaEtapa = this.etapas.get(numeroEtapa);
        Etapa outraEtapa = outroCiclista.etapas.get(numeroEtapa);
        return minhaEtapa.getTempo() - outraEtapa.getTempo();
    }

    // Calcula a diferença de tempo total entre dois ciclistas
    public int diferencaTempo(Ciclista outroCiclista) {
        return Math.abs(this.getTempoTotal() - outroCiclista.getTempoTotal());
    }
}

