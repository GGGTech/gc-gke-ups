/**
 * 
 */
package com.test.project;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author 2228641
 *
 */
@RestController
class SimpleController {
    String appName;

    @GetMapping("/")
    public String homePage() {
        
        return "home";
    }
}
@SpringBootApplication
public class OpenshiftController {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 SpringApplication.run(OpenshiftController.class, args);
		

	}

}
