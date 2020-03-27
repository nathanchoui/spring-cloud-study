package personal.nathan.gateway.auth.controller;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;
import personal.nathan.gateway.auth.provider.hello.HelloService;
import personal.nathan.gateway.auth.provider.hello.domain.User;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;
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

    @Override
    @PostMapping("/test")
    public String postTest(HttpServletRequest request) {
        try {
            Enumeration<String> headers = request.getHeaderNames();
            while (headers.hasMoreElements()) {
                System.out.println(headers.nextElement());
            }
            String res = IOUtils.toString(request.getInputStream(), "UTF-8");
            return res;
        } catch (IOException e) {
            e.printStackTrace();
            return "failed!";
        }
    }
}
