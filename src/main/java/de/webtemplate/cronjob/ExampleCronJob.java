/**
 * 
 */
package de.webtemplate.cronjob;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created for project webTemplate
 * @author Chris
 * @since 13.02.2015 - 23:38:46
 */
@Component
public class ExampleCronJob {
	
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
    	System.out.println(new Date());
    }
}
