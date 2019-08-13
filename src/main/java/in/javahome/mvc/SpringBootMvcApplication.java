package in.javahome.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcApplication.class, args);
	}

}
