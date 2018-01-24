package com.esliceu.dwes.filter;

import org.springframework.context.annotation.ComponentScan;

import javax.servlet.*;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by xavi on 24/01/18.
 */

public class TimeFilter implements Filter {
    private Logger logger = Logger.getLogger("TimeFilter");

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info(String.valueOf(System.currentTimeMillis()));
        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy() {

    }
}
