package de.webtemplate;

import java.io.File;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
@ComponentScan
@Configuration
@EnableAutoConfiguration
public class WebTemplateApplication implements EmbeddedServletContainerCustomizer {

	@Value("${webroot.directory}")
    private String documentRoot;
	
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

	@Override
	public void customize(final ConfigurableEmbeddedServletContainer container) {
		container.setDocumentRoot(new File(documentRoot));
	}
}
