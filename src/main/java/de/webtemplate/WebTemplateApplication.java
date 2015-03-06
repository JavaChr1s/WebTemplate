package de.webtemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created for project webTemplate
 * 
 * @author Chris
 * @since 09.02.2015 - 20:22:22
 */
@SpringBootApplication
@ComponentScan
@Configuration
@EnableAutoConfiguration
public class WebTemplateApplication
{

	public static void main(String[] args) {
		SpringApplication.run(WebTemplateApplication.class, args);
	}

	@Bean
	public InternalResourceViewResolver setupViewResolver() {
		final InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
