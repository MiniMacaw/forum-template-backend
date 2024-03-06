package top.mmforum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "top.mmforum")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}