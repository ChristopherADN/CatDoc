package pe.upeu.app.catdoc.persona.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import pe.upeu.app.catdoc.persona.clientes.DocenteClienteRest;
import pe.upeu.app.catdoc.commons.models.entity.Docente;
import pe.upeu.app.catdoc.persona.models.Persona;

@Service("serviceFeign")
@Primary
public class PersonaServiceFeign implements PersonaService {


	@Autowired
	private DocenteClienteRest clienteFeign;
	
	@Override
	public List<Persona> findAll() {

		return clienteFeign.listar().stream().map(p -> new Persona(p)).collect(Collectors.toList());
	}

	@Override
	public Persona findById(Integer id) {
		return new Persona(clienteFeign.detalle(id));
	}

	@Override
	public Docente save(Docente docente) {
		return clienteFeign.crear(docente);
	}

	@Override
	public void delete(Integer id) {
		Long idLong = Long.valueOf(id.longValue());
clienteFeign.eliminar(idLong);
		
	}

	@Override
	public Docente update(Docente docente, Integer id) {
		return clienteFeign.update(docente, id);
	}

}
