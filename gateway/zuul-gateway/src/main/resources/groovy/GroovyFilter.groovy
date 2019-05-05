import com.netflix.zuul.ZuulFilter
import com.netflix.zuul.context.RequestContext
import com.netflix.zuul.exception.ZuulException
import personal.nathan.common.ZuulFilterConstants

import javax.servlet.http.HttpServletRequest

/**
 * 将groovy文件放入指定gateway.groovy.directories下
 */
class GroovyFilter extends ZuulFilter {
    @Override
    String filterType() {
        return ZuulFilterConstants.FILTER_TYPE_PRE
    }

    @Override
    int filterOrder() {
        return ZuulFilterConstants.FILTER_ORDER_GROOVY
    }

    @Override
    boolean shouldFilter() {
        return true
    }

    @Override
    Object run() throws ZuulException {
        println("this is a groovy filter!")
        HttpServletRequest request = RequestContext.currentContext.request as HttpServletRequest
        Iterator headerIt = request.getHeaderNames().iterator()
        while (headerIt.hasNext()) {
            String name = (String) headerIt.next()
            String value = request.getHeader(name)
            println("header: " + name + ":" + value)
        }
        return null
    }
}
