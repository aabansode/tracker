package com.dipeshimpl;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * The class helps in initializing the application and its configuration
 *
 * @author Dipesh Nainani
 */

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {ApplicationConfig.class, JPAConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    protected String[] getServletMappings() {
        return new String[] {"/api/*"};
    }
}
