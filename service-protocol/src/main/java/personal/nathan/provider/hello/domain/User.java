package personal.nathan.provider.hello.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by za-zhangwei002 on 2019/3/27.
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long id;
    private String name;
}
