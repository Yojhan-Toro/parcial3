package edu.eci.cvds.parcial3.controller;


import edu.eci.cvds.parcial3.dtos.CitaDto;
import edu.eci.cvds.parcial3.model.Especialidad;
import edu.eci.cvds.parcial3.service.CitasService;
import edu.eci.cvds.parcial3.service.EspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cita")
public class CitasController {

    @Autowired
    CitasService citasService;

    @PostMapping
    public void addCita(@RequestBody CitaDto citaDto){
        citasService.addCitas(citaDto);
    }

    @GetMapping("/{correo}")
    public List<EspecialidadService> getCitasByCorreo(@PathVariable String correo){
        return getCitasByCorreo(correo);
    }

}
