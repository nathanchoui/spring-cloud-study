package hello;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignService {

    @PostMapping("/test")
    String find() {
        return "test";
    }
}
