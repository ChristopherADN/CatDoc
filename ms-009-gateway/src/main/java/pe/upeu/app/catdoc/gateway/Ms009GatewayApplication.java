package pe.upeu.app.catdoc.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import jdk.jfr.Enabled;

@EnableEurekaClient
@SpringBootApplication
public class Ms009GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms009GatewayApplication.class, args);
	}

}
