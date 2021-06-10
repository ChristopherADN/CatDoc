package pe.upeu.app.catdoc.persona.models.service;

import java.util.List;

import pe.upeu.app.catdoc.persona.models.Persona;

public interface PersonaService {

	public List<Persona> findAll();
	public Persona findById(Integer id);
}
