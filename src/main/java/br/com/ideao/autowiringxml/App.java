package br.com.ideao.autowiringxml;

import br.com.ideao.autowiringxml.domain.Application;
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

        context.registerShutdownHook();
    }
}