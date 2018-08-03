package nathan;

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
}
