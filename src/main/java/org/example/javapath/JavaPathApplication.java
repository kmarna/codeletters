package org.example.javapath;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaPathApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(JavaPathApplication.class);

	public static void main(String[] args) {
		LOG.info("Starting");
	
		SpringApplication.run(JavaPathApplication.class, args);
	
		LOG.info("End");
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
