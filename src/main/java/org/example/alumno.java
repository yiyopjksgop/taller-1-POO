package org.example;

public class alumno extends usuario {


    private float nota1;
    private float nota2;


    public alumno(String nombre, String cedula, float nota1, float nota2) {
        super(nombre, cedula);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }


    public float calcularPromedio() {
        return (nota1 + nota2) / 2;
    }


    public String aprobarReprobar() {
        float promedio = calcularPromedio();
        if (promedio > 7) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    public String mostrarInformacion() {
        String informacionUsuario = super.mostrarInformacion();
        String informacionAlumno = "\nNotas: \nNota 1: " + nota1 + "\nNota 2: " + nota2 +
                "\nEstado: " + aprobarReprobar();
        return informacionUsuario + informacionAlumno;
    }
}