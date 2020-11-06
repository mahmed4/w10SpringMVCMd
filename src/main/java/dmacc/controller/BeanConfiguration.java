package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.ClassInstructors;
import dmacc.beans.ClassItems;

@Configuration
public class BeanConfiguration {
	@Bean
	public ClassInstructors classInstructors() {
		ClassInstructors bean = new ClassInstructors();
	bean.setFirstName("Tom");
	bean.setLastName("Dic");
	bean.setEmail("tdic@dmacc.edu");
	return bean;
	}
	
	@Bean
	public ClassItems classItems() {
		ClassItems bean = new ClassItems("JavaII", "JavaI", "Online", "20");
	return bean;
	}

}
