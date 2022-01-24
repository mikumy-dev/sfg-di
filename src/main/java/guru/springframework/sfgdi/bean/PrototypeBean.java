package guru.springframework.sfgdi.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("Create a PrototypeBean.");
    }

    public String greeting() {
        return "I'm a PrototypeBean.";
    }
}
