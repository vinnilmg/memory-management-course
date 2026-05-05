package med.voll.api.memory.tests;

import med.voll.api.domain.consulta.Consulta;
import med.voll.api.domain.paciente.Paciente;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class MainTests {
    public static void main(String[] args) {
        // modulo1();
        // modulo2();
        modulo3();
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

    private static void modulo3() {
        final var consultas = new ArrayList<Consulta>();
        final var consulta = new Consulta();

        // Forçar o OutOfMemoryError
        IntStream.range(1, 1000000000)
                .forEach(i -> consultas.add(consulta));
    }
}
