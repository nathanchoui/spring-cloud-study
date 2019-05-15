package personal.nathan.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author nathan.z
 * @date 2019/5/15.
 */
public class SercurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/login", "/client/**")
//                .permitAll()
//                .anyRequest()
////                .authent


        super.configure(http);
    }
}
