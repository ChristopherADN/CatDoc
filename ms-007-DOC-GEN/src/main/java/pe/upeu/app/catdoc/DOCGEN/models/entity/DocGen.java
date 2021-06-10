package pe.upeu.app.catdoc.DOCGEN.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "DOC_GEN")
public class DocGen implements Serializable{

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DOC_GEN")
	private Integer idDocGen;
	
	@Column(name = "SOLICITUD_PARTICIPAR")
	private String soliPart;
	
	@Column(name = "PARTIDA_NAC")
	private String partidaNac;
	
	@Column(name = "COPIA_DNI")
	private String copiaDni;
	
	@Column(name = "CERT_SALUD_FIC_MENT")
	private String cert_salud_fic_ment;
	
	@Column(name = "ANTECEDENTES_PENALES")
	private String antPenal;
	
	@Column(name = "ESTADO")
	private Integer estado;
	
	public Integer getIdDocGen() {
		return idDocGen;
	}
	public void setIdDocGen(Integer idDocGen) {
		this.idDocGen = idDocGen;
	}
	public String getSoliPart() {
		return soliPart;
	}
	public void setSoliPart(String soliPart) {
		this.soliPart = soliPart;
	}
	public String getPartidaNac() {
		return partidaNac;
	}
	public void setPartidaNac(String partidaNac) {
		this.partidaNac = partidaNac;
	}
	public String getCopiaDni() {
		return copiaDni;
	}
	public void setCopiaDni(String copiaDni) {
		this.copiaDni = copiaDni;
	}
	public String getCert_salud_fic_ment() {
		return cert_salud_fic_ment;
	}
	public void setCert_salud_fic_ment(String cert_salud_fic_ment) {
		this.cert_salud_fic_ment = cert_salud_fic_ment;
	}
	public String getAntPenal() {
		return antPenal;
	}
	public void setAntPenal(String antPenal) {
		this.antPenal = antPenal;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	
	private static final long serialVersionUID = -7707897544350840089L;
	
}
