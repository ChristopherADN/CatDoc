package pe.upeu.app.catdoc.persona.models.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



import pe.upeu.app.catdoc.persona.models.Docente;
import pe.upeu.app.catdoc.persona.models.Persona;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private RestTemplate clienteRest;
	@Override
	public List<Persona> findAll() {
	List<Docente> docente= Arrays.asList(clienteRest.getForObject("http://localhost:8001/listar", Docente[].class));
		return docente.stream().map(p -> new Persona(p)).collect(Collectors.toList());
	}

	@Override
	public Persona findById(Integer id) {
		Map<String, String> pathVariables = new HashMap<String, String>();
		pathVariables.put("id", id.toString());
Docente docente = clienteRest.getForObject("http://localhost:8001/ver/{id}", Docente.class, pathVariables);
		return new Persona(docente);
	}

}
