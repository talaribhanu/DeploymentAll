package com.learn.external.tomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LearningToDeployIntoTheExternalTomcatApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(LearningToDeployIntoTheExternalTomcatApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure (SpringApplicationBuilder app)
	{
		return app.sources(LearningToDeployIntoTheExternalTomcatApplication.class );
	}

}
