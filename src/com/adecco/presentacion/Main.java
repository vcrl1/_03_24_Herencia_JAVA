package com.adecco.presentacion;

import com.adecco.modelo.Empleado;
import com.adecco.modelo.Gerente;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Gerente g1=new Gerente();
        g1.setNombre("Vanessa");
        g1.setSueldo(25000.98f);
//        g1.setfNac(1994);
        System.out.println(g1.toString());

        Empleado e1= new Empleado();
        e1.setNombre("Ana");
        e1.setSueldo(32000.98f);
        System.out.println(e1.toString());

        Empleado e2=new Empleado("Sara",25_000f, LocalDate.of(1994,12,30));
        System.out.println(e2.toString());

//No se heredan los constructores de Empleado, he creado otro constructor en Gerente.
        Gerente g2=new Gerente("Pepe",2000, null);
        System.out.println(g2.toString());

    }
}