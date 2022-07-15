package pl.damian.speedcarshop.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "pl.damian.speedcarshop")
public class SpeedCarShopApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpeedCarShopApplication.class, args);
    }
}
