package pe.upeu.app.catdoc.persona.models.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



import pe.upeu.app.catdoc.commons.models.entity.Docente;
import pe.upeu.app.catdoc.persona.models.Persona;

@Service("serviceRestTemplate")
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private RestTemplate clienteRest;
	@Override
	public List<Persona> findAll() {
	List<Docente> docente= Arrays.asList(clienteRest.getForObject("http://servicioDocente/listar", Docente[].class));
		return docente.stream().map(p -> new Persona(p)).collect(Collectors.toList());
	}

	@Override
	public Persona findById(Integer id) {
		Map<String, String> pathVariables = new HashMap<String, String>();
		pathVariables.put("id", id.toString());
Docente docente = clienteRest.getForObject("http://servicioDocente/ver/{id}", Docente.class, pathVariables);
		return new Persona(docente);
	}

	@Override
	public Docente save(Docente docente) {
		HttpEntity<Docente> body = new HttpEntity<Docente>(docente);
		
	ResponseEntity<Docente> response = clienteRest.exchange("http://servicioDocente/crear", HttpMethod.POST, body, Docente.class);
	Docente docenteResponse = response.getBody();	
	return docenteResponse;
	}

	@Override
	public void delete(Integer id) {
		Map<String, String> pathVariables = new HashMap<String, String>();
		pathVariables.put("id", id.toString());
clienteRest.delete("http://servicioDocente/eliminar", pathVariables);
		
	}

	@Override
	public Docente update(Docente docente, Integer id) {
		Map<String, String> pathVariables = new HashMap<String, String>();
		pathVariables.put("id", id.toString());
	HttpEntity<Docente> body = new HttpEntity<Docente>(docente);
	ResponseEntity<Docente> response = clienteRest.exchange("http://servicioDocente/editar/{id}", 
			HttpMethod.PUT, body, Docente.class, pathVariables);
		return response.getBody();
	}

}
