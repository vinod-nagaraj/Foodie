package com.healthy.foodie.servicelocator;


import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.healthy.foodie.service.PaymentRegistery;


@Configuration
public class ServiceLocatorConfiguration {
	
	/**
	 * @author Muthu
	 * 
	 *         Method Provide a configuration to implement Service Locator configuration Design pattern 
	 *         to provide different type of payment method
	 * 
	 * @param PaymentRegistery class
	 * @return Particular bean  type of different class
	 */  
	
	@Bean
	public FactoryBean<?> getBean(){
		ServiceLocatorFactoryBean bean = new ServiceLocatorFactoryBean();
		bean.setServiceLocatorInterface(PaymentRegistery.class);
		return bean;
	}
}
