package pe.upeu.app.catdoc.COMISIONDOCORD.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name= "COMISION_DOCENCIA_ORDINARIA")
public class ComisionDocOrd implements Serializable{


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_COMISION_DOCENCIA_ORDINARIA")
	private Integer idComDocOrd;
	
	@Column(name = "FECH_LISTADO")
	@Temporal(TemporalType.DATE)
	private Date fechaListado;
	
	@Column(name = "ESTADO")
	private Integer estado;
	
	@Column(name = "DOCENTE_ID_DOCENTE")
	private Integer docIdDocente;
	
	@Column(name = "DOCENTE_CATEGORIZACION_ID_CATEGORIZACION")
	private Integer docCatIdCat;

	public Integer getIdComDocOrd() {
		return idComDocOrd;
	}

	public void setIdComDocOrd(Integer idComDocOrd) {
		this.idComDocOrd = idComDocOrd;
	}

	public Date getFechaListado() {
		return fechaListado;
	}

	public void setFechaListado(Date fechaListado) {
		this.fechaListado = fechaListado;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Integer getDocIdDocente() {
		return docIdDocente;
	}

	public void setDocIdDocente(Integer docIdDocente) {
		this.docIdDocente = docIdDocente;
	}

	public Integer getDocCatIdCat() {
		return docCatIdCat;
	}

	public void setDocCatIdCat(Integer docCatIdCat) {
		this.docCatIdCat = docCatIdCat;
	}
	
	private static final long serialVersionUID = -7621943259058978228L;
	
}
