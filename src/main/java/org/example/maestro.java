package org.example;

public class maestro extends usuario {


    private String materia;
    private int ausencias;


    public maestro(String nombre, String cedula, String materia) {
        super(nombre, cedula);
        this.materia = materia;
        this.ausencias = 0;
    }

    public void registrarAusencia() {
        ausencias++;
        System.out.println("Se ha registrado una ausencia para el alumno.");
        if (ausencias == 3) {
            enviarCorreoJustificacion();
        }
    }


    private void enviarCorreoJustificacion() {
        System.out.println("Se ha enviado un correo electrónico al alumno notificando que debe justificar sus 3 faltas en la materia " + materia);
    }

    public String mostrarInformacion() {
        String informacionUsuario = super.mostrarInformacion();
        String informacionMaestro = "\nMateria: " + materia + "\nAusencias registradas: " + ausencias;
        return informacionUsuario + informacionMaestro;
    }
}