package pe.upeu.app.catdoc.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"pe.upeu.app.catdoc.usuarioscommons.models.entity"})
@SpringBootApplication
public class Ms011UsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms011UsuariosApplication.class, args);
	}

}
