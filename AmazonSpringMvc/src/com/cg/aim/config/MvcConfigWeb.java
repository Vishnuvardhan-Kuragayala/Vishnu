package com.cg.aim.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configurable
@EnableWebMvc
@ComponentScan("com.cg.aim")
public class MvcConfigWeb {
	@Bean
	public InternalResourceViewResolver getView() {
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

}
