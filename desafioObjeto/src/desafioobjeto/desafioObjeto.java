package desafioobjeto;

public class desafioObjeto {
    private double notaUm, notaDois, mediaNotas;
    
    public void calcularMedia(double notaUm, double notaDois){
        this.notaUm = notaUm;
        this.notaDois = notaDois;
        
        mediaNotas = ( notaUm + notaDois ) / 2;
    }
    
    public double imprimirNotas() {
        return mediaNotas;
    }
}
