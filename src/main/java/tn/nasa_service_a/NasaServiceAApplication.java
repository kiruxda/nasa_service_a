package tn.nasa_service_a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class NasaServiceAApplication {

	public static void main(String[] args) {
		SpringApplication.run(NasaServiceAApplication.class, args);
	}

}
