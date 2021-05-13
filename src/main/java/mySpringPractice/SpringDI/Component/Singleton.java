package mySpringPractice.SpringDI.Component;

import org.springframework.stereotype.Component;

@Component
public class Singleton {

    public Singleton(){
        System.out.println("Singleton has been instanciated...!!!");
    }

    public void callSingleton(){
        System.out.println("Singleton is called");
    }
}
