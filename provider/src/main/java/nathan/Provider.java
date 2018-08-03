package nathan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description:
 * <p>
 * Created by nathan.z on 18-7-8.
 */
@SpringBootApplication
@EnableEurekaClient
public class Provider {

    public static void main(String[] args) {
        SpringApplication.run(Provider.class, args);
    }
}
