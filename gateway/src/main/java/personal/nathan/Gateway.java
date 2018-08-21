package personal.nathan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Description:
 * <p>
 * Created by nathan.z on 18-7-4.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class Gateway {

    public static void main(String[] args) {
        SpringApplication.run(Gateway.class, args);
    }
}
