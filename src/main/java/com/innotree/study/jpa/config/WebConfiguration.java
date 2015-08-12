package com.innotree.study.jpa.config;

import org.h2.server.web.WebServlet;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 웹설정
 * 
 * @author jiheon
 *
 */
@Configuration
@EnableWebMvc
@EnableSpringDataWebSupport
public class WebConfiguration extends WebMvcAutoConfigurationAdapter {

    /**
     * 웹상에서 h2console에 접근처리
     * 
     * @return
     */
    @Bean
    public ServletRegistrationBean h2servletRegistration() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new WebServlet());
        registration.addUrlMappings("/h2console/*");
        return registration;
    }
}
