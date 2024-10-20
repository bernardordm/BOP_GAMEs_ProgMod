package Components;

public class Duracao extends Hora {
    private Hora horaInicial;
    private int duracaoTotal; // Duration in seconds

    public Duracao(Hora horaInicial, int tempoEmSegundo) {
        super(horaInicial.getHora(), horaInicial.getMinuto(), horaInicial.getSegundo());
        this.horaInicial = horaInicial;
        this.duracaoTotal = tempoEmSegundo;
    }

    public Hora getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(Hora horaInicial) {
        this.horaInicial = horaInicial;
    }

    public int getDuracaoTotal() {
        return duracaoTotal;
    }

    public void setDuracaoTotal(int duracaoTotal) {
        this.duracaoTotal = duracaoTotal;
    }

    public boolean MaiorQue(Duracao outraDuracao) {
        return this.duracaoTotal > outraDuracao.getDuracaoTotal();
    }

    public int duracaoEmSegundos() {
        return this.duracaoTotal;
    }

    public String relatorio() {
        return "Hora Inicial: " + this.horaInicial.toString() + ", Duracao Total: " + this.duracaoTotal + " segundos";
    }
}
