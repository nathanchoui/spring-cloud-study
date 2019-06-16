package personal.nathan.gateway.filter.pre;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;
import personal.nathan.gateway.common.ZuulFilterConstants;

/**
 * @author nathan.z
 * Created by za-zhangwei002 on 2019/4/27.
 */
@Component
public class LogFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return ZuulFilterConstants.FILTER_TYPE_PRE;
    }

    @Override
    public int filterOrder() {
        return ZuulFilterConstants.FILTER_ORDER_LOG;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        System.out.println("==============> pre log filter <================");

        return null;
    }
}
