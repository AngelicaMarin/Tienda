package com.tienda.repository;

import com.tienda.entity.Persona;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends CrudRepository<Persona,Long> {
    Persona findByNombre (String nombre);
    
    List<Persona> findByApellido(String apellido);
    List<Persona> findByApellidoAndApellido2(String apellido, String apellido2);
}
