package Components;

public class Etapa {
    private int numeroEtapa;
    private Data data;
    private Hora horaInicial;
    private Duracao duracao;

    // Getters e Setters
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Hora getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(Hora horaInicial) {
        this.horaInicial = horaInicial;
    }

    public Duracao getDuracao() {
        return duracao;
    }

    public void setDuracao(Duracao duracao) {
        this.duracao = duracao;
    }
    public int getTempo() {
        return duracao.getDuracaoTotal();
    }
    public int getNumeroEtapa() {
        return numeroEtapa;
    }

    public void setNumeroEtapa(int numeroEtapa) {
        this.numeroEtapa = numeroEtapa;
    }

    // Construtor
    public Etapa(int numeroEtapa, Data data, Hora horaInicial, Duracao duracao) {
        this.numeroEtapa = numeroEtapa;
        this.data = data;
        this.horaInicial = horaInicial;
        this.duracao = duracao;
    }

    // Método para retornar a duração da etapa em segundos
    public int obterTempo() {
        return duracao.getDuracaoTotal();
    }


}