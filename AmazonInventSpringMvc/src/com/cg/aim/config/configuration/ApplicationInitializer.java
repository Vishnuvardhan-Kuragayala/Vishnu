package com.cg.aim.config.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
	return new Class[] {AppContext.class};
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {WebMvc.class};
	}

	@Override
	protected String[] getServletMappings() {
	  return new String[] {"/"};
	}

}
