package pe.upeu.app.catdoc.persona.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import pe.upeu.app.catdoc.commons.models.entity.Docente;

@FeignClient(name="servicio-docente", url ="localhost:8001")
public interface DocenteClienteRest {

	@GetMapping("/listar")
	public List<Docente> listar();
	
	@GetMapping("/ver/{id}")
	public Docente detalle(@PathVariable Integer id);
	
	@PostMapping("/crear")
	public Docente crear(@RequestBody Docente docente);
	
	@PutMapping("/editar/{id}")
	public Docente update(@RequestBody Docente docente, @PathVariable Integer id);
	
	@DeleteMapping("/eliminat/{id}")
	public void eliminar(@PathVariable Long id);
}
