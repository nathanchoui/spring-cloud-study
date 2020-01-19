package personal.nathan.southSkyGate.model;

import lombok.Data;

import java.util.List;

/**
 * @author nathan.z
 * @date 2020/1/16.
 */
@Data
public class GatewayRouteDefinition {

    private String id;

    private List<GatewayPredicateDefinition> predicates;

    private List<GatewayFilterDefinition> filters;

    private String uri;

    private int order;


}
