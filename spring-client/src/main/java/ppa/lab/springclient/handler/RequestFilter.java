package ppa.lab.springclient.handler;

import jakarta.servlet.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class RequestFilter implements Filter {
    private static final Logger LOG = LoggerFactory.getLogger(RequestFilter.class);

    @Override public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        LOG.info("Request %s".formatted(request.getRequestId()));
        filterChain.doFilter(request, response);
    }

    @Override public void destroy() {
        Filter.super.destroy();
    }
}
