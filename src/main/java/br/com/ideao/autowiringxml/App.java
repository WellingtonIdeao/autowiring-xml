package br.com.ideao.autowiringxml;

import br.com.ideao.autowiringxml.domain.Application;
import br.com.ideao.autowiringxml.domain.Employee;
import br.com.ideao.autowiringxml.domain.Performer;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Application application = (Application) context.getBean("application");
        System.out.println("Application Details: " + application);

        Employee employee = (Employee) context.getBean("employee");
        System.out.println("Employee Details: " + employee);

        Performer performer = (Performer) context.getBean("performer");
        System.out.println("Performer Details: " +performer);
        context.registerShutdownHook();
    }
}