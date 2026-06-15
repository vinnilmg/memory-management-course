package med.voll.api.memory.tests;

import med.voll.api.domain.consulta.Consulta;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Modulo3 {
    public static void main(String[] args) {
        final var consultas = new ArrayList<Consulta>();
        final var consulta = new Consulta();

        // Forçar o OutOfMemoryError
        IntStream.range(1, 1000000000)
                .forEach(i -> consultas.add(consulta));
    }
}
