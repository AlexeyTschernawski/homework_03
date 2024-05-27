package app.client;

import app.controller.PersonController;
import app.domain.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {
    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app");
        PersonController controller = context.getBean(PersonController.class);
        Person person = controller.getByBorn(12091980);
        System.out.println(person);
    }
}
