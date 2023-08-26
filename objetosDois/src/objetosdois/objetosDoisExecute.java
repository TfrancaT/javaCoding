
package objetosdois;

public class objetosDoisExecute {
    public static void main(String[] args) {
        objetoDois alunoUm = new objetoDois();
        alunoUm.manipularNotas(7.3, 9.3);
        System.out.println("A média é: " + alunoUm.imprimirNotas());
    }
}
