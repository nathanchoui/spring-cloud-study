package personal.nathan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EurekaClientConfigBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by za-zhangwei002 on 2019/3/25.
 */
@RestController
@RequestMapping("/query")
public class QueryController {

    @Autowired
    private EurekaClientConfigBean eurekaClientConfigBean;

    @GetMapping("/eureka-server")
    public Object getEurekaServerUrl() {
        return eurekaClientConfigBean.getServiceUrl();
    }
}
