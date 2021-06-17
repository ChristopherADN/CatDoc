package pe.upeu.app.catdoc.DOCENTE.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.upeu.app.catdoc.DOCENTE.models.dao.DocenteDao;
import pe.upeu.app.catdoc.commons.models.entity.Docente;

@Service
public class DocenteServiceImpl implements IDocenteService{

	@Autowired
	private DocenteDao docenteDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Docente> findAll() {

		return (List<Docente>) docenteDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Docente findById(Integer id) {

		return docenteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Docente save(Docente docente) {
		// TODO Auto-generated method stub
		return docenteDao.save(docente);
	}

	@Override
	@Transactional(readOnly=true)
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		docenteDao.deleteById(id);
	}

}
