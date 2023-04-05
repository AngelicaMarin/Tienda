package com.tienda.service;

import com.tienda.entity.Persona;
import com.tienda.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> getAllPersona() {
        return (List<Persona>) personaRepository.findAll();
    }

    @Override
    public Persona getPersonaById(long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void delete(long id) {
        personaRepository.deleteById(id);
    }

    public List<Persona> findByApellidos(String apellido, String apellido2) {
        return personaRepository.findByApellidoAndApellido2(apellido, apellido2);
    }

    
    @Override
    public List<Persona> buscarPorApellido(String apellido, String apellido2) {
        return personaRepository.findByApellidoAndApellido2(apellido, apellido2);
    }

    @Override
    public Persona findByNombre(String username) {
        return personaRepository.findByNombre(username);
    }

    
}
