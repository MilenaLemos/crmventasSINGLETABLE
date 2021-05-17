package com.company.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "oportunidades")
public class Oportunidad {
    private int idOportunidad;
    private Date ultimaFechaContacto;
    private Date proximaFechaContacto;
    private Byte clienteAceptaLlamada;
    private Integer precioOfrecido;

    public Oportunidad() {
    }

    public Oportunidad(Date ultimaFechaContacto, Date proximaFechaContacto, Byte clienteAceptaLlamada, Integer precioOfrecido) {
        this.ultimaFechaContacto = ultimaFechaContacto;
        this.proximaFechaContacto = proximaFechaContacto;
        this.clienteAceptaLlamada = clienteAceptaLlamada;
        this.precioOfrecido = precioOfrecido;
    }

    @Id
    @Column(name = "idOportunidad")
    @GeneratedValue (strategy = GenerationType.AUTO)
    public int getIdOportunidad() {
        return idOportunidad;
    }

    public void setIdOportunidad(int idOportunidad) {
        this.idOportunidad = idOportunidad;
    }

    @Basic
    @Column(name = "ultimaFechaContacto")
    public Date getUltimaFechaContacto() {
        return ultimaFechaContacto;
    }

    public void setUltimaFechaContacto(Date ultimaFechaContacto) {
        this.ultimaFechaContacto = ultimaFechaContacto;
    }

    @Basic
    @Column(name = "proximaFechaContacto")
    public Date getProximaFechaContacto() {
        return proximaFechaContacto;
    }

    public void setProximaFechaContacto(Date proximaFechaContacto) {
        this.proximaFechaContacto = proximaFechaContacto;
    }

    @Basic
    @Column(name = "clienteAceptaLlamada")
    public Byte getClienteAceptaLlamada() {
        return clienteAceptaLlamada;
    }

    public void setClienteAceptaLlamada(Byte clienteAceptaLlamada) {
        this.clienteAceptaLlamada = clienteAceptaLlamada;
    }

    @Basic
    @Column(name = "precioOfrecido")
    public Integer getPrecioOfrecido() {
        return precioOfrecido;
    }

    public void setPrecioOfrecido(Integer precioOfrecido) {
        this.precioOfrecido = precioOfrecido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oportunidad that = (Oportunidad) o;
        return idOportunidad == that.idOportunidad && Objects.equals(ultimaFechaContacto, that.ultimaFechaContacto) && Objects.equals(proximaFechaContacto, that.proximaFechaContacto) && Objects.equals(clienteAceptaLlamada, that.clienteAceptaLlamada) && Objects.equals(precioOfrecido, that.precioOfrecido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOportunidad, ultimaFechaContacto, proximaFechaContacto, clienteAceptaLlamada, precioOfrecido);
    }

    @Override
    public String toString() {
        return "Oportunidad{" +
                "idOportunidad=" + idOportunidad +
                ", ultimaFechaContacto=" + ultimaFechaContacto +
                ", proximaFechaContacto=" + proximaFechaContacto +
                ", clienteAceptaLlamada=" + clienteAceptaLlamada +
                ", precioOfrecido=" + precioOfrecido +
                '}';
    }
}
