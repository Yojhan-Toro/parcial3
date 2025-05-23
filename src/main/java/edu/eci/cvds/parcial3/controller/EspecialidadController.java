
package edu.eci.cvds.parcial3.controller;

import edu.eci.cvds.parcial3.model.Especialidad;
import edu.eci.cvds.parcial3.service.EspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/especialidad")
public class EspecialidadController {

    @Autowired
    EspecialidadService especialidadService;

    @PostMapping
    public Especialidad addEspecialidad(Especialidad especialidad){
       return especialidadService.addEspecialidad(especialidad);
    }

}
