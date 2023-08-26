package objetosdois;

public class objetoDois {
    private double notaUm, notaDois, mediaNotas;
    
    public void manipularNotas(double notaUm, double notaDois) {
        this.notaUm = notaUm;
        this.notaDois = notaDois;
        
        mediaNotas = ( notaUm + notaDois ) / 2;
    }
    
    public double imprimirNotas(){
        return mediaNotas;
    }
}
