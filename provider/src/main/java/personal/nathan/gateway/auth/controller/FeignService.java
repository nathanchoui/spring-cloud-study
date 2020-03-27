package personal.nathan.gateway.auth.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class FeignService {

    @PostMapping("/feignTest")
    String find() throws InterruptedException {
        TimeUnit.SECONDS.sleep(10);
        return "feignTest";
    }
}
