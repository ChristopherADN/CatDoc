package pe.upeu.app.catdoc.DOCENTE.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PutMapping("/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Docente editar(@RequestBody Docente docente, @PathVariable Integer id) {
		Docente docenteDb = docenteService.findById(id);
		docenteDb.setNombre(docente.getNombre());
		docenteDb.setApMaterno(docente.getApMaterno());
		docenteDb.setApPaterno(docente.getApPaterno());
		docenteDb.setCampus(docente.getCampus());
		docenteDb.setCatIdCat(docente.getCatIdCat());
		docenteDb.setClave(docente.getClave());
		docenteDb.setCorreo(docente.getCorreo());
		docenteDb.setDni(docente.getDni());
		docenteDb.setEstado(docente.getEstado());
		docenteDb.setFechaNacimiento(docente.getFechaNacimiento());
		docenteDb.setSexo(docente.getSexo());
		docenteDb.setUsuario(docente.getUsuario());
		return docenteService.save(docenteDb);
	}
	
	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Integer id) {
		docenteService.deleteById(id);
	}
}
