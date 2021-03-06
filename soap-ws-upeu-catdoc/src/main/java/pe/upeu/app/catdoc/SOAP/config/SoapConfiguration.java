package pe.upeu.app.catdoc.SOAP.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;

@EnableWs
@Configuration
public class SoapConfiguration extends WsConfigurerAdapter{

	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDistatcherServlet(ApplicationContext context){
		MessageDispatcherServlet message = new MessageDispatcherServlet();
		message.setApplicationContext(context);
		return new ServletRegistrationBean<>(message,"/upeu/ws/*");
		
	}
	
	@Bean(name = "docenteDemo")
	public Wsdl11Definition wsdl11Definition() {
		SimpleWsdl11Definition simpleWsdl11Definition = new SimpleWsdl11Definition();
		simpleWsdl11Definition.setWsdl(new ClassPathResource("/wsdl/docente.wsdl"));
		return simpleWsdl11Definition;
	}
}
