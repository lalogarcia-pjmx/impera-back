package impera.springboot.app.filters;

import java.io.IOException;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
@Order(1)
public class LoggerFilter implements Filter{

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {
    
        HttpServletRequest httpRequest = (HttpServletRequest) req;
        System.out.println("Request received for: " + httpRequest.getRemoteHost() + httpRequest.getRequestURI());
        
        // Pass request to the next filter or controller
        chain.doFilter(req, res);
        
        HttpServletResponse httpResponse = (HttpServletResponse) res;
        System.out.println("Response status: " + httpResponse.getStatus());
    }

}
