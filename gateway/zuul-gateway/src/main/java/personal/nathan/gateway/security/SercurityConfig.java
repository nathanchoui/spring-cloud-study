package personal.nathan.gateway.security;

import org.springframework.context.annotation.Configuration;

/**
 * @author nathan.z
 * @date 2019/5/15.
 */
//@EnableOAuth2Sso
@Configuration
public class SercurityConfig {

    // extends WebSecurityConfigurerAdapter
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/login", "/provider/**")
//                .permitAll()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .csrf()
//                .disable();
//    }
}
