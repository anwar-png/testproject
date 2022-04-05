package com.cts;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String args[])
	{

ApplicationContext ctxt = new ClassPathXmlApplicationContext("com/cts/spring.xml");


   EmployeeBean eb=(EmployeeBean)ctxt.getBean("employee");
   
   System.out.println(eb.getAge()+" "+eb.getName()+" "+eb.getAddress());
   
    
  
   
    
   
   


      
   
   
   
   
   
   
   
   
   
   
   
   
   
   
     
     
     

  



	}

}
