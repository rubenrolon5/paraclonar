package CrudRepository;
import Modelo.Persona;


import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona,Integer> {
}
