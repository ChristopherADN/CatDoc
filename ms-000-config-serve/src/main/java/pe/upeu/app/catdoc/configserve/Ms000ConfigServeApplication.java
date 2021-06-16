package pe.upeu.app.catdoc.configserve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Ms000ConfigServeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms000ConfigServeApplication.class, args);
	}

}
