public class operadorTernario {

    public static void main(String[] args) {

        int numberA, numberB;
        numberA = 6;
        numberB = 5;

        String primeiroNome = "Tales";
        String segundoNome = "Tales";

        System.out.println(primeiroNome.equals(segundoNome));

        
        // Utilizando operador ternário para simplificar uma condição de checagem entre duas variavéis;
        String numberResult = numberA == numberB ?"true" : "false";

        System.out.println(numberResult);
    }
}