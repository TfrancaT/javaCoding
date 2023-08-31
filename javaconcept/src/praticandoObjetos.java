
public class praticandoObjetos {
    
    private double notaUm, notaDois, mediaNotas;


    /* Ao criar um metodo do 'tipo' void, significa que ela não retornará nenhum procedimento */
    public void calcularMedia(double notaUm, double notaDois){ 
        this.notaUm = notaUm;
        this.notaDois = notaDois;

        mediaNotas = ( notaUm + notaDois ) / 2;
    }

    /* Metodos com algum 'tipo', retornam procedimentos do mesmo tipo */
    public double imprimirMedia(){
        return mediaNotas;
    }
}
