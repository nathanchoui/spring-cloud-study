package nathan;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/greeting/{name}")
	public String sayHello(@PathVariable(value = "name", required = false) String name) {
		return StringUtils.isBlank(name) ? "Hello, guest" : "Hello, " + name;
	}
}
