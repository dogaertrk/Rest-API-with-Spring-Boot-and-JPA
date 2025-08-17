package com.doa.rest_demo.configuration; // kendi package'ını kullan

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;

@Configuration
public class SpringfoxPathMatchFix {
    @Bean
    public WebMvcRegistrations webMvcRegistrations() {
        return new WebMvcRegistrations() {
            @Override
            public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
                RequestMappingHandlerMapping m = new RequestMappingHandlerMapping();
                m.setPatternParser(null); // AntPathMatcher kullan
                return m;
            }
        };
    }
}
