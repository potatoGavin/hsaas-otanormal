package com.hemily.hsaasotanormal.handler;


import com.hemily.hsaasotanormal.utils.AbstractRequestUtils;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 请求body多次读取的实现类
 * 实现原理：先读取原始body，修改后通过过滤器再重新写入body
 */
public class MultiReadHttpServletRequestWrapper extends HttpServletRequestWrapper {
    private String tempBody;

    public MultiReadHttpServletRequestWrapper(HttpServletRequest request) {
        super(request);
        tempBody = AbstractRequestUtils.getRequestBody(request);
    }

    @Override
    public ServletInputStream getInputStream() {
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(tempBody.getBytes());
        return new ServletInputStream() {
            @Override
            public boolean isReady() {
                return false;
            }

            @Override
            public int readLine(byte[] b, int off, int len) throws IOException {
                return super.readLine(b, off, len);
            }

            @Override
            public boolean isFinished() {
                return false;
            }

            @Override
            public void setReadListener(ReadListener readListener) {

            }

            @Override
            public int read() {
                return byteArrayInputStream.read();
            }
        };
    }

    @Override
    public BufferedReader getReader() {
        return new BufferedReader(new InputStreamReader(this.getInputStream()));
    }

    public String getBody() {
        return this.tempBody;
    }

    public void setBody(String body) {
        this.tempBody = body;
    }

}