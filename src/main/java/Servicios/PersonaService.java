package Servicios;
import Modelo.Persona;

import CrudRepository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class PersonaService {

    @Autowired
    private PersonaRepository repository;

    public List<Persona> getLista() {
        List<Persona> lista = new ArrayList<Persona>();
        repository.findAll().forEach(lista::add);
        return lista;
    }

    public Optional<Persona> getById(Integer id) {
        return repository.findById(id);
    }

    // Crear un nuevo registro
    public Persona create(Persona item) {
        return repository.save(item);
    }

    //Actualizar un registro
    public Persona update(Persona item) {
        return repository.save(item);
    }

    //Borrar los registros
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}