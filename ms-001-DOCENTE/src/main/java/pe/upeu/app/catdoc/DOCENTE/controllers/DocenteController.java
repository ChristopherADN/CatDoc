package pe.upeu.app.catdoc.DOCENTE.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pe.upeu.app.catdoc.DOCENTE.models.entity.Docente;
import pe.upeu.app.catdoc.DOCENTE.models.service.IDocenteService;

@RestController
public class DocenteController {

	@Autowired
	private IDocenteService docenteService;
	
	@GetMapping("/listar")
	public List<Docente> Listar(){
		return docenteService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Docente detalle(@PathVariable Integer id) {
		return docenteService.findById(id);
	}
	
	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Docente crear(@RequestBody Docente docente) {
		return docenteService.save(docente);
			
	}
}
