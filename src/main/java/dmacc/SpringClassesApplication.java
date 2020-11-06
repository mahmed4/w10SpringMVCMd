package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.ClassInstructors;
import dmacc.beans.ClassItems;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ClassInstructorsRepository;
@SpringBootApplication
public class SpringClassesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringClassesApplication.class, args);
		
//				ApplicationContext appContext = new
//				AnnotationConfigApplicationContext(BeanConfiguration.class);
//				ClassInstructors c = appContext.getBean("classInstructors", ClassInstructors.class);
//				System.out.println(c.toString());
	}
	
//	@Autowired
//	ClassInstructorsRepository repo;
//
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//		
//		//Using an existing bean
//		ClassInstructors b = appContext.getBean("classInstructors", ClassInstructors.class);
//		
//		//Create a bean to use - not managed by Spring
//		ClassInstructors i = new ClassInstructors("Sandra","Bolton", "sbolton@dmacc.edu");
//		ClassItems c = new ClassItems("JavaII", "JavaI", "Online","20");
//		i.setClassItems(c);
//		repo.save(i);
//		
//		List<ClassInstructors> allMyClassInstructors = repo.findAll();
//		for(ClassInstructors people: allMyClassInstructors) {
//			System.out.println(people.toString());
//		}
//		
//		//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
//		((AbstractApplicationContext) appContext).close();
//	
//	}
}
