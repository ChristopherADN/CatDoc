package pe.upeu.app.catdoc.usuarios.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import pe.upeu.app.catdoc.usuarioscommons.models.entity.Usuario;

@RepositoryRestResource(path="usuarios")
public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Integer>{

	@RestResource(path="buscar-username")
	public Usuario findByUsername(@Param("username") String username);
	
	
	
}
