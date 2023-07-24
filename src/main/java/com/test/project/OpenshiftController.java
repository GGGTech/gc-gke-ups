/**
 * 
 */
package com.test.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 2228641
 *
 */

@SpringBootApplication
@RestController
public class OpenshiftController {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(OpenshiftController.class, args);

	}

	@GetMapping("/")
	public String homePage() {

		return "home";
	}
	@GetMapping("/getTheVallue")
	public String getTheValue() {

		return "This is the openshift test code";
	}
}
