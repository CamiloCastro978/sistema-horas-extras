package co.bamocol.horasextras;

import java.time.LocalTime;

public class Empleado {

    // Atributos
    private String cedula;
    private String nombre;
    private String cargo;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;
    private boolean activo;

    // Constructor
    public Empleado(String cedula, String nombre, String cargo,
            LocalTime horaEntrada, LocalTime horaSalida) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cargo = cargo;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
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

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

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

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    // Representación en texto
    @Override
    public String toString() {
        return cedula + " - " + nombre + " (" + cargo + ") " +
                horaEntrada + " a " + horaSalida;
    }
}
