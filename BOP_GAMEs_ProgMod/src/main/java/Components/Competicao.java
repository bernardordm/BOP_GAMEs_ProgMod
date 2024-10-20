package Components;

public class Competicao {
    // Atributos
    private int contadorEtapas;

    // Getters and Setters
    public int getNumeroDeEtapas() {
        return contadorEtapas;
    }

    public void setNumeroDeEtapas(int numeroDeEtapas) {
        this.contadorEtapas = contadorEtapas;
    }
    //Metodo Construtor

    public Competicao(int numeroDeEtapas) {
        this.contadorEtapas = numeroDeEtapas;
    }

    //Metodos comparativos

    public int diferencaDeTempoDoisCiclistas(Ciclista ciclista, Ciclista outroCiclista) {
        return ciclista.diferencaTempo(outroCiclista);
    }

    public Ciclista quemTerminouNaFrenteDoisCiclistas(Ciclista ciclista, Ciclista outroCiclista) {
        if (ciclista.compararCiclistas(outroCiclista) < 0) {
            return ciclista;
        } else {
            return outroCiclista;
        }
    }




}
