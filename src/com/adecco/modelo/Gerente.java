package com.adecco.modelo;

import java.time.LocalDate;

public class Gerente extends Empleado{
    //1.Atributos
    private String departamento;
    //2.Métodos
    @Override
    public String toString() {
        return "Gerente{" +
                "departamento='" + departamento + '\'' +
                '}' +super.toString();
    }
    //3.Constructores
    public Gerente(){};
    public Gerente(String nombre, float sueldo, LocalDate fNac) {
        super(nombre, sueldo, fNac);
    }


    //4.Setters y getters

    public String getDepartamento() {
        return departamento;

    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
