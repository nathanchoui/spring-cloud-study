package personal.nathan.controller;

import org.springframework.web.bind.annotation.RequestParam;
import personal.nathan.provider.hello.domain.User;
import personal.nathan.remoteInvoke.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvokerController {

	@Autowired
	private HelloClient helloClient;

	@GetMapping("/greeting/{name}")
	public String welcome(@PathVariable("name") String name) {
		return helloClient.sayHello(name);
	}

	@GetMapping("/timeoutReq/{milliseconds}")
	public String hystrix(@PathVariable("milliseconds") int milliseconds) {
//		HystrixCircuitBreaker breaker = HystrixCircuitBreaker.Factory
//				.getInstance(HystrixCommandKey.Factory.asKey("HystrixClient#timeoutReq()"));
//		System.out.println("断路器状态：" + breaker.isOpen());
		return helloClient.timeoutReq(milliseconds);
	}

	@GetMapping("/hello")
	public String sayHelloWithUser(@RequestParam("id") long id, @RequestParam("name") String name) {
		return helloClient.sayHelloWithUser(new User(id, name));
	}

}
