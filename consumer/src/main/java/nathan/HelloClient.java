package nathan;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/8/2.
 */
@FeignClient("provider")
public interface HelloClient {

    @GetMapping("/greeting/{name}")
    String sayHello(@PathVariable(value = "name", required = false) String name);
}
