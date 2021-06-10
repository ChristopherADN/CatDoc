package pe.upeu.app.catdoc.DOCENTE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Ms001DocenteApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms001DocenteApplication.class, args);
	}

}
