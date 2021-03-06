package pe.upeu.app.catdoc.GESTIONPREVIA.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "GESTION_PREVIA")
public class GestionPrevia implements Serializable{


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_GESTION_PREVIA")
	private Integer idGestionPrevia;
	
	@Column(name = "PAGO_DERECHO")
	private String pagoDerecho;
	
	@Column(name = "PRE_INSCRIP")
	private String preInscrip;
	
	@Column(name = "ESTADO")
	private Integer estado;

	
	public Integer getIdGestionPrevia() {
		return idGestionPrevia;
	}

	public void setIdGestionPrevia(Integer idGestionPrevia) {
		this.idGestionPrevia = idGestionPrevia;
	}

	public String getPagoDerecho() {
		return pagoDerecho;
	}

	public void setPagoDerecho(String pagoDerecho) {
		this.pagoDerecho = pagoDerecho;
	}

	public String getPreInscrip() {
		return preInscrip;
	}

	public void setPreInscrip(String preInscrip) {
		this.preInscrip = preInscrip;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	
	private static final long serialVersionUID = -2463064397834361696L;
	
}
