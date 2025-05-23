package edu.eci.cvds.parcial3.repository;

import edu.eci.cvds.parcial3.model.Cita;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CitasRepository extends MongoRepository<Cita, String> {
    List<Cita> findAllByCorreo(String correo);
}
