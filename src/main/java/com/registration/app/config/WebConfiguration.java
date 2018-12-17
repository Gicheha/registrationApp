package com.registration.app.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * This is a MessageResource Spring Bean that
 * automatically loads the contents of validation.properties
 * to memory
 */

@Configuration
@EnableWebSecurity
public class WebConfiguration  implements WebMvcConfigurer {

	@Bean
	public MessageSource messageSource(){
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		//Load File: Validation properties
		messageSource.setBasename("classpath:validation");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}


}
