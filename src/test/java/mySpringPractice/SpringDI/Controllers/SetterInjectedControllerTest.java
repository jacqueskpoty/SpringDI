package mySpringPractice.SpringDI.Controllers;

import mySpringPractice.SpringDI.Services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();

        setterInjectedController.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void sayGreetings() {
        System.out.println(setterInjectedController.sayGreetings());
    }
}