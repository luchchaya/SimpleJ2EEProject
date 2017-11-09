package com.teaminternational.web;

import com.teaminternational.HelloWorldGenerator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServlet extends BaseHttpServlet {
    protected void doGet (HttpServletRequest request, HttpServletResponse response) {
        doGet(request, response);
        HelloWorldGenerator generator = getBean(HelloWorldGenerator.COMPONENT_NAME);
        generator.sayHello();
    }
}
