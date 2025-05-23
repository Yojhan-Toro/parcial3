package edu.eci.cvds.parcial3.repository;

import edu.eci.cvds.parcial3.model.Especialidad;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EspecialidadRepository extends MongoRepository<Especialidad, String> {
}
