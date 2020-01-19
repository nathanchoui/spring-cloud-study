package personal.nathan.southSkyGate.model;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author nathan.z
 * @date 2020/1/16.
 */
@Data
public class GatewayFilterDefinition {
    private String name;

    private Map<String, String> args = new LinkedHashMap<>();

}
