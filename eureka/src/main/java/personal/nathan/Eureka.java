package personal.nathan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description:
 * <p>
 * Created by nathan.z on 18-7-4.
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka {

    public static void main(String[] args) {
        SpringApplication.run(Eureka.class, args);
    }
}
