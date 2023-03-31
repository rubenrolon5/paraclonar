package Controller;

import Modelo.Persona;
import Servicios.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    private PersonaService service;

    @GetMapping("")
    public ResponseEntity<List<Persona>> getLista(){
        return ResponseEntity.ok(service.getLista());
    }
    @GetMapping("/{id}")
    public Optional<Persona> getOne(@PathVariable Integer id){
        return service.getById(id);

    }
    @PostMapping("/save")
    public ResponseEntity<Persona> create (@RequestBody Persona created){

        return ResponseEntity.ok(service.create(created));
    }
    @PutMapping("/save")
    public ResponseEntity<Persona> update(@RequestBody Persona updated){
        return ResponseEntity.ok(service.update(updated));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.ok("Ok");
    }
}
