package pe.upeu.app.catdoc.persona.models.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pe.upeu.app.catdoc.commons.models.entity.Docente;
import pe.upeu.app.catdoc.persona.models.Persona;
import pe.upeu.app.catdoc.persona.models.service.PersonaService;

@RestController
public class PersonaController {

	@Autowired
	@Qualifier("serviceFeign")
	private PersonaService personaService;

	@GetMapping("/listar")
	public List<Persona> listar(){
		return personaService.findAll();
	}

	@GetMapping("/ver/{id}")
	public Persona correo(@PathVariable Integer id) {
		return personaService.findById(id);
	}
	
	
	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Docente cerar(@RequestBody Docente docente) {
		return personaService.save(docente);
	}
	
	@PutMapping("/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Docente editar(@RequestBody Docente docente, @PathVariable Integer id) {
		return personaService.update(docente, id);
	}
	
	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Integer id) {
		personaService.delete(id);
	}
}
