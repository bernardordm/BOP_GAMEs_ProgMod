package Components;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void ajustarHora(int hora, int minuto, int segundo) {
        if (validarHora(hora, minuto, segundo)) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Hora inválida");
        }
    }

    public static boolean validarHora(int hora, int minuto, int segundo) {
        if (hora < 0 || hora > 23) {
            return false;
        }
        if (minuto < 0 || minuto > 59) {
            return false;
        }
        if (segundo < 0 || segundo > 59) {
            return false;
        }
        return true;
    }

    public Hora incrementar(int quantidadeSegundos) {
        this.segundo += quantidadeSegundos;
        while (this.segundo >= 60) {
            this.segundo -= 60;
            this.minuto++;
            if (this.minuto >= 60) {
                this.minuto -= 60;
                this.hora++;
                if (this.hora >= 24) {
                    this.hora -= 24;
                }
            }
        }
        return this;
    }

    public boolean EstahNaFrenteDe(Hora outra) {
        if (this.hora > outra.hora) {
            return true;
        } else if (this.hora == outra.hora) {
            if (this.minuto > outra.minuto) {
                return true;
            } else if (this.minuto == outra.minuto) {
                return this.segundo > outra.segundo;
            }
        }
        return false;
    }

    public String HoraFormatada() {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }

}

