package com.cg.aim.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class ApplicationInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer {

		@Override
		protected Class<?>[] getRootConfigClasses() {
			// TODO Auto-generated method stub
			return new Class[] {AppContexts.class};
		}

		@Override
		protected Class<?>[] getServletConfigClasses() {
			// TODO Auto-generated method stub
			return new Class[] {MvcConfigWeb.class};
		}

		@Override
		protected String[] getServletMappings() {
			// TODO Auto-generated method stub
			return new String[] {"/"};
		}

}