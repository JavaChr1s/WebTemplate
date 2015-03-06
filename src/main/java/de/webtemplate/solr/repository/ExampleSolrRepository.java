/**
 * 
 */
package de.webtemplate.solr.repository;

import java.util.List;

import org.springframework.data.solr.repository.SolrCrudRepository;

import de.webtemplate.solr.document.ExampleDocument;

/**
 * Created for project webTemplate
 * @author Chris
 * @since 13.02.2015 - 23:35:37
 */
public interface ExampleSolrRepository extends SolrCrudRepository<ExampleDocument, String> {

	List<ExampleDocument> findByName(String name);
}
