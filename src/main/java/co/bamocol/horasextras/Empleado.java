package co.bamocol.horasextras;

import java.time.LocalTime;

public class Empleado {

    // Atributos
    private String cedula;
    private String nombre;
    private String cargo;
    private Jornada jornada;
    private boolean activo;

    // Constructor
    public Empleado(String cedula, String nombre, String cargo,
            Jornada jornada) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cargo = cargo;
        this.jornada = jornada;
        this.activo = true;
    }

    // Getters
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public Jornada getJornada() { return jornada; }

    public boolean isActivo() {
        return activo;
    }

    // Setters
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setJornada(Jornada jornada) { this.jornada = jornada; }

    // Representación en texto
    @Override
    public String toString() {
        return cedula + " - " + nombre + " (" + cargo + ") " +
                jornada;
    }
}
