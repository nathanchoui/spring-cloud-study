package personal.nathan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableCircuitBreaker
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "personal.nathan.remoteInvoke")
public class Consumer {

	public static void main(String[] args) {
		SpringApplication.run(Consumer.class, args);
	}
}
