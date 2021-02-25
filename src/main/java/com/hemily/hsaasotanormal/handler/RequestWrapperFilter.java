package com.hemily.hsaasotanormal.handler;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;

public class RequestWrapperFilter implements Filter {

    @Override
    public void init(FilterConfig config) {
        System.out.println("==>RequestWrapperFilter启动");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws java.io.IOException, ServletException {
        MultiReadHttpServletRequestWrapper requestWrapper = new MultiReadHttpServletRequestWrapper((HttpServletRequest) request);
        chain.doFilter(requestWrapper, response);
    }

    @Override
    public void destroy() {
    }
}
