package com.adecco.modelo;

import java.time.LocalDate;

public class Empleado {
    //1.Atributos
    protected String nombre;
    protected float sueldo;
    protected LocalDate fNac;
    //2.Métodos

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", fNac=" + fNac +
                '}';
    }

    //3.Constructores
    public Empleado(){}
    public Empleado(String nombre, float sueldo, LocalDate fNac) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fNac = fNac;
    }

    //4.Setters y getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public LocalDate getfNac() {
        return fNac;
    }

    public void setfNac(LocalDate fNac) {
        this.fNac = fNac;
    }
}
