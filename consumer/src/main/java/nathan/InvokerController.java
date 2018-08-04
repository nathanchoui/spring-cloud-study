package nathan;

import com.netflix.hystrix.HystrixCircuitBreaker;
import com.netflix.hystrix.HystrixCommandKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvokerController {

	@Autowired
	private HelloClient helloClient;

	@Autowired
	private HystrixClient hystrixClient;

	@GetMapping("/greeting/{name}")
	public String welcome(@PathVariable("name") String name) {
		return helloClient.sayHello(name);
	}

	@GetMapping("/timeoutReq/{milliseconds}")
	public String hystrix(@PathVariable("milliseconds") int milliseconds) {
//		HystrixCircuitBreaker breaker = HystrixCircuitBreaker.Factory
//				.getInstance(HystrixCommandKey.Factory.asKey("HystrixClient#timeoutReq()"));
//		System.out.println("断路器状态：" + breaker.isOpen());
		return hystrixClient.timeoutReq(milliseconds);
	}
}
