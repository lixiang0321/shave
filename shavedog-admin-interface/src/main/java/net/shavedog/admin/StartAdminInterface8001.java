package net.shavedog.admin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class StartAdminInterface8001 {
    public static void main(String[] args) {
        SpringApplication.run(StartAdminInterface8001.class, args);
    }
}
