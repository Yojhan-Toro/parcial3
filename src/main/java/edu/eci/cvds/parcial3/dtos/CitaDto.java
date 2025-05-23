package edu.eci.cvds.parcial3.dtos;


import org.springframework.data.annotation.Id;


public class CitaDto {

    @Id
    String id;

    String nombre;
    String correo;
    int cedula;
    String fechaCita;
    String idEspecialidad;
    String doctor;
    String ubicacion;
    String estado;


    public int getCedula() {
        return cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getEstado() {
        return estado;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public String getId() {
        return id;
    }

    public String getIdEspecialidad() {
        return idEspecialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}
