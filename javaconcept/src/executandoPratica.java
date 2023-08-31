public class executandoPratica {
    public static void main(String[] args) {
        praticandoObjetos alunoUm = new praticandoObjetos();
        alunoUm.calcularMedia(6.7, 6.3);
        System.out.println("Media: " + alunoUm.imprimirMedia());

        calcularViagem hyundaiCreta = new calcularViagem();
        hyundaiCreta.simularCusto(112, 7.1);
        System.out.println( "O Hyundai Creta gastara " + hyundaiCreta.mostrarCusto() + "R$" );
        
        calcularViagem hondaCivic = new calcularViagem();
        hondaCivic.simularCusto(112, 12.8);
        System.out.println( "O Honda Civic gasta " + hondaCivic.mostrarCusto() + "R$" );
    }
}
