package guru.springframework.sfgdi;

import com.springframework.pet.controllers.PetController;
import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"guru.springframework.sfgdi","com.springframework.pet"})
@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

        // ask Spring to create the instance of that Object
        MyController myController = (MyController) context.getBean("myController");

        // and use that Object to execute the sayHello method
        System.out.println(myController.sayHello());

        System.out.println("---------- property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController") ;
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("---------- setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController") ;
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("---------- constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController") ;
        System.out.println(constructorInjectedController.getGreeting());

        System.out.println("---------- i18n");
        I18nGreetingController i18nGreetingController = (I18nGreetingController) context.getBean("i18nGreetingController");
        System.out.println(i18nGreetingController.getGreeting());

        System.out.println("---------- pets");
        PetController petController = (PetController) context.getBean("petController");
        System.out.println(petController.sayPets());
    }

}