package br.com.example.init;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.example")
public class Application {
	private static Logger logger = LogManager.getLogger(Application.class);
	public static void main(String[] args) {
		logger.info("Logger Aqui");
		SpringApplication.run(Application.class, args);
		logger.info("Logger fim aqui");
	}
}
