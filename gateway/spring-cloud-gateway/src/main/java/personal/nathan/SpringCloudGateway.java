package personal.nathan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * Created by za-zhangwei002 on 2019/4/2.
 */
@SpringBootApplication
public class SpringCloudGateway {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                //basic proxy
                .route(r ->r.path("/provider")
                        .uri("http://localhost:9001/greeting/nathan").id("provider_route")
                ).build();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudGateway.class, args);
    }

}