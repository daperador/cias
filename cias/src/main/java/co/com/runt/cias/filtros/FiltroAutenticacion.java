/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.runt.cias.filtros;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author daniel
 */
@WebFilter(filterName = "FiltroAutenticacion", urlPatterns = {"*.html", "/partials/*", "/js/*", "/webresources/*"})
public class FiltroAutenticacion implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //inicio del filtro
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        ((HttpServletRequest)request).getSession().setAttribute("usuario", "admin");
        ((HttpServletRequest)request).getSession().setAttribute("id_cia", "1");
        chain.doFilter(request, response);
        
    }

    @Override
    public void destroy() {
        //destruccion del filtro
    }
    
    
    
}
