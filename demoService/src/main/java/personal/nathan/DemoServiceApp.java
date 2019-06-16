package personal.nathan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Description:
 * <p>
 * Created by nathan.z on 18-11-18.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DemoServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(DemoServiceApp.class, args);
    }
}
