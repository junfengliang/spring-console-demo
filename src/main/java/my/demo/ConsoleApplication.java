package my.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author junfeng
 */
@SpringBootApplication
public class ConsoleApplication implements CommandLineRunner {

    @Value("${spring.application.name}")
    String name;

    public static void main(String[] args) {
        SpringApplication.run(ConsoleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(name);
    }
}
