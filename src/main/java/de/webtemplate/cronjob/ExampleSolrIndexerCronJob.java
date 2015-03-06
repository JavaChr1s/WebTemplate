/**
 * 
 */
package de.webtemplate.cronjob;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import de.webtemplate.solr.document.ExampleDocument;
import de.webtemplate.solr.repository.ExampleSolrRepository;

/**
 * Created for project webTemplate
 * @author Chris
 * @since 13.02.2015 - 23:38:46
 */
@Component
public class ExampleSolrIndexerCronJob {
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Autowired
	private ExampleSolrRepository exampleSolrRepository;
	
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
    	final ExampleDocument example = new ExampleDocument();
    	example.setName("example_name");
    	example.setExampleAttribute(dateFormat.format(new Date()));
    	exampleSolrRepository.save(example);
    }
}
