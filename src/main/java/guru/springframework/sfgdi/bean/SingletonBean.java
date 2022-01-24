package guru.springframework.sfgdi.bean;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("Create a SingletonBean.");
    }

    public String greeting() {
        return "I'm a SingletonBean.";
    }
}
