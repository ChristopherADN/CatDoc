package pe.upeu.app.catdoc.persona.models;

import pe.upeu.app.catdoc.commons.models.entity.Docente;

public class Persona {

	private Docente docente;

	public Persona() {

	}

	public Persona(Docente docente) {
		this.docente = docente;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public String getNombre() {
		return docente.getNombre();
	}
	
}
