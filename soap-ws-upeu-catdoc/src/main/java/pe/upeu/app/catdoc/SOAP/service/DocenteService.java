package pe.upeu.app.catdoc.SOAP.service;

import java.util.List;
import java.util.Optional;

import pe.upeu.app.catdoc.SOAP.entity.Docente;

public interface DocenteService {

	public List<Docente> lista();
	
	public Optional<Docente> buscarById(Integer id);
	
	public Docente registrar(Docente object);
	
	public Docente actualizar (Docente object);
	
	public void eliminar(Integer id);
	
	
}
