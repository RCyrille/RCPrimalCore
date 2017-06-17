package rc.primal.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class PrimalCoreApp {
	public static String getMessage() {
		return "Primal Core is running";
	}

	public static void main(String[] args) {
		SpringApplication.run(PrimalCoreApp.class, args);
	}

}
