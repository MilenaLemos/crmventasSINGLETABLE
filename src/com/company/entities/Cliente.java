package com.company.entities;


import javax.persistence.Column;
import javax.persistence.Entity;

@Entity

public class Cliente extends Persona{
    private String empresa;


    @Column(name = "empresa")
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "empresa='" + empresa + '\'' +
                ", idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                ", mail='" + mail + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cargo='" + cargo + '\'' +
                ", dtype='" + dtype + '\'' +
                '}';
    }
}
