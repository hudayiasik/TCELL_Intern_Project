package com.mailservice.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.*")//not a managed type err fixed
@ComponentScan("com.*")//not a managed type err fixed
@EntityScan("com.*")

//@EntityScan("com.mailservice.app1.*")
@SpringBootApplication

public class App1Application {

	public static void main(String[] args) {
		SpringApplication.run(App1Application.class, args);
	}

}
