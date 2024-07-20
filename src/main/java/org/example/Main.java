package org.example;

public class Main {

    public static void main(String[] args) {

        usuario usuario1 = new usuario("Juan Pérez", "123456789");
        usuario usuario2 = new maestro("María Gómez", "987654321", "Matemáticas");

        alumno alumno1 = new alumno("Pedro López", "76543210", 8.5f, 9.2f);
        alumno alumno2 = new alumno("Ana Ramírez", "65432176", 6.8f, 5.4f);

        if (usuario2 instanceof maestro) {
            maestro maestro = (maestro) usuario2;
            maestro.registrarAlumno(alumno1);
            maestro.registrarAlumno(alumno2);

            maestro.registrarAusencia(alumno1);
            maestro.registrarAusencia(alumno1);
            maestro.registrarAusencia(alumno1);
        } else {
            System.out.println("Error: usuario2 no es un objeto Maestro.");
        }

        System.out.println("\nInformación de usuarios:");
        System.out.println(usuario1.mostrarInformacion());
        System.out.println(usuario2.mostrarInformacion());

        System.out.println("\nInformación del alumno 1:");
        System.out.println(alumno1.mostrarInformacion());
    }
}