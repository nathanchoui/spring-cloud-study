package nathan;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/8/4.
 */
@FeignClient(value = "provider", fallback = HystrixClientFallback.class)
public interface HystrixClient {

    @GetMapping("/timeoutReq/{milliseconds}")
    public String timeoutReq(@PathVariable("milliseconds") int milliseconds) ;

}

class HystrixClientFallback implements HystrixClient {
    @Override
    public String timeoutReq(int milliseconds) {
        return "timeoutReq failure!!!";
    }
}
