package com.company.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "personas")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)

public class Persona {
    protected int idPersona;
    protected String nombre;
    protected String mail;
    protected String telefono;
    protected String cargo;
    protected String dtype;

    public Persona() {
    }

    public Persona(String nombre, String mail, String telefono, String cargo, String dtype) {
        this.nombre = nombre;
        this.mail = mail;
        this.telefono = telefono;
        this.cargo = cargo;
        this.dtype = dtype;
    }

    @Id
    @Column(name = "idPersona")
    @GeneratedValue (strategy = GenerationType.AUTO)
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }


    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Column(name = "mail")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


    @Column(name = "telefono")
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    @Column(name = "cargo")
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    @Column(name = "dtype")
    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return idPersona == persona.idPersona && Objects.equals(nombre, persona.nombre) && Objects.equals(mail, persona.mail) && Objects.equals(telefono, persona.telefono) && Objects.equals(cargo, persona.cargo) && Objects.equals(dtype, persona.dtype);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPersona, nombre, mail, telefono, cargo, dtype);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                ", mail='" + mail + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cargo='" + cargo + '\'' +
                ", dtype='" + dtype + '\'' +
                '}';
    }
}
