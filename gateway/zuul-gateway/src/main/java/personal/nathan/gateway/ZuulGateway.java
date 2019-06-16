package personal.nathan.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Description:
 * <p>
 * Created by nathan.z on 18-7-4.
 */
@SpringBootApplication(scanBasePackages = "personal.nathan")
//@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulGateway {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGateway.class, args);
    }

}
