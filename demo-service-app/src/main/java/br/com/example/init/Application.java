package br.com.example.init;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication(scanBasePackages = "br.com.example")
public class Application {
	private static Logger logger = LogManager.getLogger(Application.class);
	public static void main(String[] args)throws IOException {
		logger.info("Log começa aqui!!!");
		SpringApplication.run(Application.class, args);
	}
}
