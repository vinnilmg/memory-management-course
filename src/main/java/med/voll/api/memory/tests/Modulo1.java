package med.voll.api.memory.tests;

import med.voll.api.domain.paciente.Paciente;

public class Modulo1 {
    public static void main(String[] args) {
            final var paciente = new Paciente();
            System.out.println(paciente);

            // Forçar o StackOverflowError
            paciente.consultas();
    }
}
