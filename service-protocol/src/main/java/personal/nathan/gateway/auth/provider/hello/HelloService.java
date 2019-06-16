package personal.nathan.gateway.auth.provider.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import personal.nathan.gateway.auth.provider.hello.domain.User;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by za-zhangwei002 on 2019/3/27.
 */
public interface HelloService {

    @GetMapping("/greeting/{name}")
    String sayHello(@PathVariable(value = "name", required = false) String name);

    @GetMapping("/timeoutReq/{milliseconds}")
    String timeoutReq(@PathVariable("milliseconds") int milliseconds);

    /**
     * pojo的Get
     * @param user
     * @return
     */
    @GetMapping("/hello")
    String sayHelloWithUser(User user);

    @PostMapping("/test")
    String postTest(HttpServletRequest request);
}
