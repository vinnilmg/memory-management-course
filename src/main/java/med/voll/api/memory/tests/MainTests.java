package med.voll.api.memory.tests;

import med.voll.api.domain.paciente.Paciente;

public class MainTests {
    public static void main(String[] args) {
        // modulo1();
        // modulo2();
    }

    private static void modulo1() {
        final var paciente = new Paciente();
        System.out.println(paciente);

        // Forçar o StackOverflowError
        paciente.consultas();
    }

    private static void modulo2() {
        final var valor1 = "Alura";
        final var valor2 = "Alura";
        System.out.println(valor1 == valor2); // true

        final var valor3 = new String("Alura");
        System.out.println(valor1 == valor3); // false
    }
}
