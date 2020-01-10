package br.com.microservice.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringMicroserviceZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroserviceZuulApplication.class, args);
	}

}
