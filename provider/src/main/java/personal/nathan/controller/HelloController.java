package personal.nathan.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import personal.nathan.provider.hello.HelloService;
import personal.nathan.provider.hello.domain.User;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

@RestController
public class HelloController implements HelloService {

    @GetMapping("/greeting/{name}")
    public String sayHello(@PathVariable(value = "name", required = false) String name) {
        return StringUtils.isBlank(name) ? "Hello, guest" : "Hello, " + name;
    }

    @GetMapping("/timeoutReq/{milliseconds}")
    public String timeoutReq(@PathVariable("milliseconds") int milliseconds) {
        System.out.println("==========sleep start==========");
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("==========sleep " + milliseconds + " ms =======");
        return milliseconds + " ms process request";
    }

    /**
     * pojo的Get
     *
     * @param user
     * @return
     */
    @GetMapping("/hello")
    public String sayHelloWithUser(User user) {
        return Optional.of(user).orElse(new User()).toString();
    }
}
