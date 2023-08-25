package orientacaoobjetos;

public class mediaObject {
    private double notaUm, notaDois, mediaNotas;
    public void calcularMedia(double notaUm, double notaDois) {
        this.notaUm = notaUm;
        this.notaDois = notaDois;
        
        mediaNotas = (notaUm + notaDois) / 2;
    }
    public double imprimirMedia() {
        return mediaNotas;
    }
}
