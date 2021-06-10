package pe.upeu.app.catdoc.SOAP.impl;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.upeu.app.catdoc.SOAP.entity.Docente;
import pe.upeu.app.catdoc.SOAP.repository.DocenteRepository;
import pe.upeu.app.catdoc.SOAP.service.DocenteService;

@Service
public class DocenteServiceImpl implements DocenteService{

		
	@Autowired
	private DocenteRepository repo;
	
	/*CRUDS*/
	
	@Transactional(readOnly = true)
	@Override
	public List<Docente> lista() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<Docente> buscarById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Transactional
	@Override
	public Docente registrar(Docente object) {
		// TODO Auto-generated method stub
		return repo.save(object);
	}

	@Transactional
	@Override
	public Docente actualizar(Docente object) {
		// TODO Auto-generated method stub
		return repo.save(object);
	}

	@Transactional
	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

}
