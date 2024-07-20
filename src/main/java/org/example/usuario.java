package org.example;
public class usuario {


    private String nombre;
    private String cedula;

    public usuario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }


    public String mostrarInformacion() {
        return "Nombre: " + nombre + "\nCédula: " + cedula;
    }

    public maestro asInstanceOf(Class<maestro> maestroClass) {

        return null;
    }

    public void registrarAlumno(alumno alumno1) {
    }

    public void registrarAusencia(alumno alumno1) {
    }
}