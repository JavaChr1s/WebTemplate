/**
 * 
 */
package de.webtemplate.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import de.webtemplate.entity.Example;

/**
 * Created for project webTemplate
 * @author Chris
 * @since 13.02.2015 - 17:18:26
 */
public interface ExampleDAO extends CrudRepository<Example, Long> {

	List<Example> findByExampleAttribute(String exampleAttribute);
}
