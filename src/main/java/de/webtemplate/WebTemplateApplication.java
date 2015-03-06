package de.webtemplate;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
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
@EnableScheduling
@EnableSolrRepositories("de.webtemplate.solr.repository")
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

	@Bean
	public SolrServer solrServer() {
		return new HttpSolrServer("http://localhost:8983/solr");
	}

	@Bean
	public SolrTemplate solrTemplate(final SolrServer server) throws Exception {
		return new SolrTemplate(server);
	}
}
