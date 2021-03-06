package pe.upeu.app.catdoc.ROLDOC.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "ROL_DOC")
public class RolDoc implements Serializable{

		

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ROL_DOC")
	private Integer idRolDoc;
	
	@Column(name = "ESTADO")
	private Integer estado;
	
	@Column(name = "DOCENTE_ID_DOCENTE")
	private Integer docIdDoc;
	
	@Column(name = "ROL_ID_ROL")
	private Integer rolIdRol;

	public Integer getIdRolDoc() {
		return idRolDoc;
	}

	public void setIdRolDoc(Integer idRolDoc) {
		this.idRolDoc = idRolDoc;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Integer getDocIdDoc() {
		return docIdDoc;
	}

	public void setDocIdDoc(Integer docIdDoc) {
		this.docIdDoc = docIdDoc;
	}

	public Integer getRolIdRol() {
		return rolIdRol;
	}

	public void setRolIdRol(Integer rolIdRol) {
		this.rolIdRol = rolIdRol;
	}
	
	private static final long serialVersionUID = -6863351186146074187L;
	
}
