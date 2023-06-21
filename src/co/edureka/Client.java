package co.edureka;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object construction | Done by developer
		
	/*	Employee eRef = new Employee();
		eRef.setEid(101);
		eRef.setEname("Arpit Namdeo");
		eRef.setEaddress("Bangalore");*/
		
		//System.out.println("Employee Details :"+eRef);
	
		//spring way | IOC (inversion of control)
		//Resource resource = new ClassPathResource("employeebean.xml");
		//BeanFactory factory = new XmlBeanFactory(resource);//spring container which shall parse XML file and construct the object
		//beanfactory -- spring container
		//Employee e1 = (Employee)factory.getBean("emp1");
		//Employee e2 = factory.getBean("emp2", Employee.class);
		//System.out.println("Employee1"+e1);
		//System.out.println("Employee2"+e2);
		//applicationcontext -- spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		Employee e1= context.getBean("emp1", Employee.class);
		System.out.println(e1);
		Employee e2 = (Employee)context.getBean("emp2");
		System.out.println(e2);
	}

}
