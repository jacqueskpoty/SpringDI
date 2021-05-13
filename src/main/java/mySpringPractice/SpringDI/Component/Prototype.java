package mySpringPractice.SpringDI.Component;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class Prototype {

    public Prototype(){
        System.out.println("Prototype has been instanciated....!!!!!!!!");
    }

    public void callPrototype(){
        System.out.println("Prototype is called");
    }
}
