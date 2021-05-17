package com.company.entities;


import javax.persistence.Column;
import javax.persistence.Entity;

@Entity

public class Vendedor extends Persona{
    private Integer salario;


    @Column(name = "salario")
    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                ", mail='" + mail + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cargo='" + cargo + '\'' +
                ", dtype='" + dtype + '\'' +
                ", salario=" + salario +
                '}';
    }
}
