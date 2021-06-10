package pe.upeu.app.catdoc.persona.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import pe.upeu.app.catdoc.persona.models.Docente;

@FeignClient(name="servicio-docente", url ="localhost:8001")
public interface DocenteClienteRest {

	@GetMapping("/listar")
	public List<Docente> listar();
	
	@GetMapping("/ver/{id}")
	public Docente detalle(@PathVariable Integer id);
}
