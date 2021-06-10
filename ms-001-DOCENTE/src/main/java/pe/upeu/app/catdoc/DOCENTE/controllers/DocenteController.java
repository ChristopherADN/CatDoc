package pe.upeu.app.catdoc.DOCENTE.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
}
