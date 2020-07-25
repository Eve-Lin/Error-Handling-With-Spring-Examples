package com.example.errors.rest;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@Configuration
public class ErrorConfig {

    @Bean
    public DefaultErrorAttributes overideErrorAttributes() {
        return new DefaultErrorAttributes() {
            @Override
            public Map<String, Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options) {
                Map<String, Object> unfilteredAttributes = this.getErrorAttributes(webRequest,
                        options.isIncluded(ErrorAttributeOptions.Include.STACK_TRACE));

                Map<String, Object> filteredAttributes = super.getErrorAttributes(webRequest, options);

                if (unfilteredAttributes.get("message") != null) {
                    unfilteredAttributes.put("message", "");
                }

                filteredAttributes.put("caused", "Stamat is on fire again");

                return filteredAttributes;
            }
        };

    }
}

