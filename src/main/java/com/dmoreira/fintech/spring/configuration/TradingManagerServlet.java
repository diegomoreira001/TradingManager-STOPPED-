package com.dmoreira.fintech.spring.configuration;

import com.vaadin.spring.server.SpringVaadinServlet;
import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;

/**
 * Created by diego.moreira on 11/7/2016.
 */
@WebServlet(urlPatterns = "/*", name = "ShowMeTheMoney", displayName = "Trading Manager", asyncSupported = true)
public class TradingManagerServlet extends SpringVaadinServlet {

    @WebListener
    public static class CustomContextLoaderListener extends ContextLoaderListener {

    }
}
