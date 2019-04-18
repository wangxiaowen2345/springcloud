package qust;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApplicationPrivider8002 {


    public static void main(String [] args) {
        SpringApplication.run(ApplicationPrivider8002.class ,args);
    }
}
