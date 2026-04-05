package co.bamocol.horasextras;

import java.time.LocalTime;

public class Jornada {

    // Atributos
    private String nombre;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;
    private boolean esNocturna;

    // Constructor
    public Jornada(String nombre, LocalTime horaEntrada,
            LocalTime horaSalida, boolean esNocturna) {
        this.nombre = nombre;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.esNocturna = esNocturna;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public boolean isEsNocturna() {
        return esNocturna;
    }

    // Setters solo para lo que puede cambiar
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEsNocturna(boolean esNocturna) {
        this.esNocturna = esNocturna;
    }

    // Texto descriptivo
    @Override
    public String toString() {
        return nombre + ": " + horaEntrada + " a " + horaSalida;
    }
}