package personal.nathan.gateway.common;

/**
 * Created by za-zhangwei002 on 2019/4/27.
 */
public class ZuulFilterConstants {

    private ZuulFilterConstants() {
    }

    public final static String FILTER_TYPE_PRE = "pre";

    public final static int FILTER_ORDER_LOG = -100;
    public final static int FILTER_ORDER_FIRST = -90;
    public final static int FILTER_ORDER_SECOND = -80;
    public final static int FILTER_ORDER_GROOVY = -70;
}
