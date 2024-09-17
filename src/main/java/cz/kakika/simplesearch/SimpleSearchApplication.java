package cz.kakika.simplesearch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SimpleSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleSearchApplication.class, args);
        log.info("App is running on: http://localhost:8080/");
    }
}
