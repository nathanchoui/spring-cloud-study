package personal.nathan.filter.pre;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;
import personal.nathan.common.ZuulFilterConstants;

/**
 * @author nathan.z
 * @date 2019/5/2.
 */
@Component
public class FirstFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return ZuulFilterConstants.FILTER_TYPE_PRE;
    }

    @Override
    public int filterOrder() {
        return ZuulFilterConstants.FILTER_ORDER_FIRST;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("first filter");
        return null;
    }
}
