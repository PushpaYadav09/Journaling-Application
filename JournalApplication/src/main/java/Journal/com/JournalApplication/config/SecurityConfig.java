package Journal.com.JournalApplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain() throws Exception {
        HttpSecurity http = HttpSecurity.class.newInstance(); // Local variable
        AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry authorizationManagerRequestMatcherRegistry = http.csrf().disable()  // Disable CSRF protection for development/testing
                .authorizeHttpRequests()  // Use correct method in Spring Security 6.x
                .anyRequest().permitAll();// Allow all requests without authentication
        return http.build();
    }
}
