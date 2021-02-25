package com.hemily.hsaasotanormal.config;


import com.hemily.hsaasotanormal.handler.AuthInterceptor;
import com.hemily.hsaasotanormal.handler.RequestWrapperFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.Filter;

/**
 * 拦截器配置类
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    /**
     * 注册过滤器
     * 实现请求body的多次读取
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean addRequestWrapperFilter() {
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new RequestWrapperFilter());
        registration.setName("RequestWrapperFilter");
        registration.addUrlPatterns("/api/*");
        registration.setOrder(1);
        return registration;
    }

    /**
     * 注册拦截器
     * 对不合法的请求进行拦截
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 签名验证拦截器
        registry.addInterceptor(getAuthInterceptor()).addPathPatterns("/api/**");
        WebMvcConfigurer.super.addInterceptors(registry);
    }

    @Bean
    public AuthInterceptor getAuthInterceptor() {
        return new AuthInterceptor();
    }
}
