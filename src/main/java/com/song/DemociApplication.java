package com.song;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@RestController
public class DemociApplication {

	private static final Logger logger = LoggerFactory.getLogger(DemociApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemociApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return str("caicloud");
	}

	@GetMapping("/{str}")
	public String str(@PathVariable(value = "str") String str) {

		logger.info("The content you enter is: "+str);
		return "<h1>Hello, "
				+ str +
				" -- Caicloud</h1>";
	}

}
