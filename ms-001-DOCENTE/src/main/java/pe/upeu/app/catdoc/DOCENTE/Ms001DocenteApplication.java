package pe.upeu.app.catdoc.DOCENTE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"pe.upeu.app.catdoc.commons.models.entity"})
public class Ms001DocenteApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms001DocenteApplication.class, args);
	}

}
