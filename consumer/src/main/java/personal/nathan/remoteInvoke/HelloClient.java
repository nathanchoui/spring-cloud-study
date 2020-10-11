package personal.nathan.remoteInvoke;

import org.springframework.cloud.openfeign.FeignClient;
import personal.nathan.gateway.auth.provider.hello.HelloService;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/8/2.
 */
@FeignClient(value = "provider")
public interface HelloClient extends HelloService {

//    @Component
//    class HelloClientFallback implements HelloClient {
//        @Override
//        public String sayHello(String name) {
//            return "failure";
//        }
//
//        @Override
//        public String timeoutReq(int milliseconds) {
//            return "failure";
//        }
//
//        @Override
//        public String sayHelloWithUser(User user) {
//            return "failure";
//        }
//
//    }


}
