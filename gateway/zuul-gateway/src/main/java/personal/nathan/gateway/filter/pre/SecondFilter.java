package personal.nathan.gateway.filter.pre;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;
import personal.nathan.gateway.common.ZuulFilterConstants;

import javax.servlet.http.HttpServletRequest;

/**
 * @author nathan.z
 * @date 2019/5/2.
 */
@Component
public class SecondFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return ZuulFilterConstants.FILTER_TYPE_PRE;
    }

    @Override
    public int filterOrder() {
        return ZuulFilterConstants.FILTER_ORDER_SECOND;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("second filter");
        // 获取当前上下文
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest httpServletRequest = ctx.getRequest();
        String a = httpServletRequest.getParameter("a");
        if (null == a) {
            // 对该请求禁止路由
            ctx.setSendZuulResponse(false);
            // 设置响应消息
            ctx.setResponseBody("{\"status\":\"500\"}");
            ctx.set("logic-is-successful", false);
            return null;
        }
        ctx.set("logic-is-successful", true);
        return null;
    }
}
