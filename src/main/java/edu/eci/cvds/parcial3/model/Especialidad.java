package edu.eci.cvds.parcial3.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Especialidades")
public class Especialidad
{
    @Id
    String id;

    String descripcion;
    String doctor;
    String ubicacion;

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
