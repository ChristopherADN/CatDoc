package pe.upeu.app.catdoc.persona.models.service;

import java.util.List;

import pe.upeu.app.catdoc.commons.models.entity.Docente;
import pe.upeu.app.catdoc.persona.models.Persona;

public interface PersonaService {

	public List<Persona> findAll();
	public Persona findById(Integer id);
	
	public Docente save(Docente docente);
	
	public Docente update(Docente docente, Integer id);
	
	public void delete(Integer id);
	
}
