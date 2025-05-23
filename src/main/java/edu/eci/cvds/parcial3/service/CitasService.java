package edu.eci.cvds.parcial3.service;

import edu.eci.cvds.parcial3.dtos.CitaDto;
import edu.eci.cvds.parcial3.model.Cita;
import edu.eci.cvds.parcial3.model.Especialidad;
import edu.eci.cvds.parcial3.repository.CitasRepository;
import edu.eci.cvds.parcial3.repository.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.annotation.Retention;
import java.util.List;

@Service
public class CitasService {

    @Autowired
    CitasRepository citasRepository;

    @Autowired
    EspecialidadRepository especialidadRepository;

    public void addCitas(CitaDto citaDto){
        Cita cita = new Cita();
        cita.setId(citaDto.getId());
        cita.setCedula(citaDto.getCedula());
        cita.setDoctor(citaDto.getDoctor());
        cita.setCorreo(citaDto.getCorreo());
        cita.setEstado(citaDto.getEstado());
        cita.setUbicacion(citaDto.getUbicacion());
        cita.setFechaCita(citaDto.getFechaCita());

        Especialidad e = especialidadRepository.findById(citaDto.getIdEspecialidad()).orElse(null);

        cita.setEspecialidad(e);

        citasRepository.save(cita);
    }

    public List<Cita> getCitasByCorreo(String correo){
        return citasRepository.findAllByCorreo(correo);
    }

}
