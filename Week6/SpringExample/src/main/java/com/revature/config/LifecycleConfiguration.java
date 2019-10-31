package com.revature.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.revature.beans.House;
import com.revature.beans.LifecycleBean;

@Configuration
public class LifecycleConfiguration {

	@Bean
	@Scope("prototype")
	public House house() {
		return new House();
	}
	
	@Bean(name = "myLifecycleBean", destroyMethod = "myCustomDestroy", initMethod = "myCustomInit")
	@Scope("singleton")
	public LifecycleBean lifecycleBean() {
		return new LifecycleBean();
	}
	
}
