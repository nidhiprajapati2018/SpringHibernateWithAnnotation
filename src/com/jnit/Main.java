package com.jnit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String args[]) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringHibernateConfiguration.class);
 
        SpringSelect studentselect = (SpringSelect) context.getBean("springselect");
 
        Student s = new Student();
        s.setSid(105);
        s.setMarks(598);
        s.setName("Bhanu");
        
        studentselect.saveStudent(s);
        
        context.close();
        
    }
}
