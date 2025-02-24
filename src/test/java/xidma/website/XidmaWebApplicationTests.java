package xidma.website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class XidmaWebApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(XidmaWebApplicationTests.class, args);
	}

}