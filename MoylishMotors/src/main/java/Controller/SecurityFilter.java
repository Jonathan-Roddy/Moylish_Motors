/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jonathan Roddy
 */
@WebFilter(filterName = "SecurityFilter")
public class SecurityFilter implements Filter {

    private FilterConfig filterConfig = null;
    public String [] allowedHosts;
    
    public void init(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
        String hostsString = filterConfig.getInitParameter("allowedHosts");

        if (hostsString != null && !hostsString.trim().equals("")) {
            allowedHosts = hostsString.split("\n");
        }
    }//end init

    
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        String remoteAddress = httpRequest.getRemoteAddr();

        boolean allowed = false;

//        for (String host : allowedHosts) {
//            if (host.trim().equals(remoteAddress)) {
//                allowed = true;
//                break;
//            }//end if
//        }//end for

        //String allowedHosts = filterConfig.getInitParameter("allowedHosts");
        for (String host : allowedHosts) {
            if (host.trim().equals(remoteAddress)) {
                allowed = true;
                break;
            }//end if
        }//end for

        if (allowed) {
            chain.doFilter(request, response);
        } else {
            filterConfig.getServletContext()
                    .log("Attempted admin access for unauthorised IP " + remoteAddress);
            httpResponse.sendError(404);
            chain.doFilter(request, response);
        }//end else       
    }//end doFilter

    
    public void destroy() {
        filterConfig = null;
    }

}
