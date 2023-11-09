package org.example.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean<FirebaseAuthenticationFilter> firebaseAuthenticationFilter() {
        FilterRegistrationBean<FirebaseAuthenticationFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new FirebaseAuthenticationFilter());
        registrationBean.addUrlPatterns("/api/*");  // Update this to your needs
        return registrationBean;
    }
}
