/**
 * 
 */
package de.webtemplate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created for project webTemplate
 * @author Chris
 * @since 13.02.2015 - 17:11:03
 */
@Entity
public class Example {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long code;
	private String exampleAttribute;

	public long getCode() {
		return code;
	}

	public String getExampleAttribute() {
		return exampleAttribute;
	}

	public void setExampleAttribute(final String exampleAttribute) {
		this.exampleAttribute = exampleAttribute;
	}
}
