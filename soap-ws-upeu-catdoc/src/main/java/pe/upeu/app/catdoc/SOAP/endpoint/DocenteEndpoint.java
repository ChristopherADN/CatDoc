package pe.upeu.app.catdoc.SOAP.endpoint;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Optional;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import pe.upeu.app.catdoc.SOAP.entity.Docente;
import pe.upeu.app.catdoc.SOAP.service.DocenteService;
import pe.upeu.ws.services.docente.CreateDocenteRequest;
import pe.upeu.ws.services.docente.CreateDocenteResponse;
import pe.upeu.ws.services.docente.DocenteType;
import pe.upeu.ws.services.docente.GetDocenteByIdRequest;
import pe.upeu.ws.services.docente.GetDocenteByIdResponse;
import pe.upeu.ws.services.docente.ObjectFactory;
import pe.upeu.ws.services.docente.UpdateDocenteRequest;
import pe.upeu.ws.services.docente.UpdateDocenteResponse;


@Endpoint
public class DocenteEndpoint {

	private static final String NAMESPACE_URI="http://ws.upeu.pe/services/docente";
	@Autowired
	private DocenteService service;
	
	@ResponsePayload
	@PayloadRoot(namespace=NAMESPACE_URI, localPart = "getDocenteByIdRequest")
	public GetDocenteByIdResponse buscarById(@RequestPayload GetDocenteByIdRequest request) {
		var objectFactory = new ObjectFactory();
		var response = objectFactory.createGetDocenteByIdResponse();
		Optional<Docente> docente= service.buscarById(request.getId());
		if(docente.isEmpty())
			return null;
		var docenteType= new DocenteType();
		BeanUtils.copyProperties(docente.get(), docenteType);
		docenteType.setFechaNacimiento(toDateXML(docente.get().getFechaNacimiento()));
		response.setDocenteType(docenteType);
		return response;
	}
	
	@ResponsePayload
	@PayloadRoot(namespace=NAMESPACE_URI, localPart = "createDocenteRequest")
	public CreateDocenteResponse registrar(@RequestPayload CreateDocenteRequest request) {
		var objectFactory = new ObjectFactory();
		var response = objectFactory.createCreateDocenteResponse();
		var d=new Docente();
		d.setNombre(request.getDocenteType().getNombre());
		d.setApMaterno(request.getDocenteType().getApMaterno());
		d.setApPaterno(request.getDocenteType().getApPaterno());
		d.setDni(request.getDocenteType().getDni());
		d.setCorreo(request.getDocenteType().getCorreo());
		d.setFechaNacimiento(request.getDocenteType().getFechaNacimiento().toGregorianCalendar().getTime());
		d.setSexo(request.getDocenteType().getSexo());
		d.setUsuario(request.getDocenteType().getUsuario());
		d.setClave(request.getDocenteType().getClave());
		d.setCampus(request.getDocenteType().getCampus());
		d.setEstado(request.getDocenteType().getEstado());
		d.setCatIdCat(request.getDocenteType().getCatIdcat());
		
		var dnew = new Docente();
		dnew= service.registrar(d);
		
		var docenteType=new DocenteType();
		BeanUtils.copyProperties(dnew, docenteType);
		response.setDocenteType(docenteType);
		return response;

	}

	
	@ResponsePayload
	@PayloadRoot(namespace=NAMESPACE_URI, localPart = "updateDocenteRequest")
	public UpdateDocenteResponse actualizar(@RequestPayload UpdateDocenteRequest request) {
		var objectFactory = new ObjectFactory();
		var response = objectFactory.createUpdateDocenteResponse();
		Optional<Docente> docente=service.buscarById(request.getDocenteType().getId());
		if(docente.isEmpty())
			return null;
		
		docente.get().setNombre(request.getDocenteType().getNombre());
		docente.get().setApMaterno(request.getDocenteType().getApMaterno());
		docente.get().setApPaterno(request.getDocenteType().getApPaterno());
		docente.get().setDni(request.getDocenteType().getDni());
		docente.get().setCorreo(request.getDocenteType().getCorreo());
		docente.get().setFechaNacimiento(request.getDocenteType().getFechaNacimiento().toGregorianCalendar().getTime());
		docente.get().setSexo(request.getDocenteType().getSexo());
		docente.get().setUsuario(request.getDocenteType().getUsuario());
		docente.get().setClave(request.getDocenteType().getClave());
		docente.get().setCampus(request.getDocenteType().getCampus());
		docente.get().setEstado(request.getDocenteType().getEstado());
		docente.get().setCatIdCat(request.getDocenteType().getCatIdcat());
		service.actualizar(docente.get());
		
		var docenteType= new DocenteType();
		BeanUtils.copyProperties(docente.get(), docenteType);
		docenteType.setFechaNacimiento(toDateXML(docente.get().getFechaNacimiento()));
		response.setDocenteType(docenteType);
		return response;
	}
	
	private XMLGregorianCalendar toDateXML(Date date) {
		GregorianCalendar gc=new GregorianCalendar();
		gc.setTime(date);
		try {
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		} catch(DatatypeConfigurationException e) {
			return null;
		}
	}
}
