package desafioobjeto;

public class desafioObjetoExecute {

    public static void main(String[] args) {

        desafioObjeto alunoUm = new desafioObjeto();
        alunoUm.calcularMedia(7, 9);
        System.out.println("A média é: " + alunoUm.imprimirNotas());
        
    }
}
