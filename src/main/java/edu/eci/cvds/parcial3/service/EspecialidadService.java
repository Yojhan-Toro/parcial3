package edu.eci.cvds.parcial3.service;

import edu.eci.cvds.parcial3.model.Especialidad;
import edu.eci.cvds.parcial3.repository.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EspecialidadService {

    @Autowired
    EspecialidadRepository especialidadRepository;

    public Especialidad addEspecialidad(Especialidad especialidad){

        Especialidad e = new Especialidad();
        e.setUbicacion(especialidad.getUbicacion());
        e.setDescripcion(especialidad.getDescripcion());
        e.setDoctor(especialidad.getDoctor());
        e.setId(especialidad.getId());

        return especialidadRepository.save(e);
    }

}
