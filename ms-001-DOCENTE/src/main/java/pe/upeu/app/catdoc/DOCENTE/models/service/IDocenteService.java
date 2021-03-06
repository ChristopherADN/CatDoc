package pe.upeu.app.catdoc.DOCENTE.models.service;

import java.util.List;

import pe.upeu.app.catdoc.commons.models.entity.Docente;

public interface IDocenteService {

	public List<Docente> findAll();
	public Docente findById(Integer id);
	
	public Docente save(Docente docente);
	
	public void deleteById(Integer id);
}
