package med.voll.api.memory.tests;

public class Modulo2 {
    public static void main(String[] args) {
        final var valor1 = "Alura";
        final var valor2 = "Alura";
        System.out.println(valor1 == valor2); // true

        final var valor3 = new String("Alura");
        System.out.println(valor1 == valor3); // false
    }
}
