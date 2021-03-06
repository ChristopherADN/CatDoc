package pe.upeu.app.catdoc.CATEGORIZACION.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "CATEGORIZACION")
public class Categorizacion implements Serializable{

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CATEGORIZACION")
	private Integer idCat;
	
	@Column(name = "ESTADO")
	private Integer estado;
	
	@Column(name = "GESTION_PREVIA_ID_GESTION_PREVIA")
	private Integer gpIdGestionPrevia;
	
	@Column(name = "DOC_GEN_ID_DOC_GEN")
	private Integer dgIdDocGen;

	public Integer getIdCat() {
		return idCat;
	}

	public void setIdCat(Integer idCat) {
		this.idCat = idCat;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Integer getGpIdGestionPrevia() {
		return gpIdGestionPrevia;
	}

	public void setGpIdGestionPrevia(Integer gpIdGestionPrevia) {
		this.gpIdGestionPrevia = gpIdGestionPrevia;
	}

	public Integer getDgIdDocGen() {
		return dgIdDocGen;
	}

	public void setDgIdDocGen(Integer dgIdDocGen) {
		this.dgIdDocGen = dgIdDocGen;
	}
	
	private static final long serialVersionUID = -8708351228168334074L;
	
}
