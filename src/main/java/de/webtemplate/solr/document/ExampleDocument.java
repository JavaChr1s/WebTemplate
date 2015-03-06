/**
 * 
 */
package de.webtemplate.solr.document;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;

/**
 * Created for project webTemplate
 * @author Chris
 * @since 13.02.2015 - 23:50:41
 */
@SolrDocument
public class ExampleDocument {
	
	@Field
	private String name;
	@Field
	private String exampleAttribute;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getExampleAttribute() {
		return exampleAttribute;
	}

	public void setExampleAttribute(final String exampleAttribute) {
		this.exampleAttribute = exampleAttribute;
	}
	
	
}
