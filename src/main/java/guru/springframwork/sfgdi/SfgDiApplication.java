package guru.springframwork.sfgdi;

import guru.springframwork.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

        // ask Spring to create the instance of that Object
        MyController myController = (MyController) context.getBean("myController");

        // and use that Object to execute the sayHello method
        System.out.println(myController.sayHello());
    }

}
