package mySpringPractice.SpringDI.Controllers;

import mySpringPractice.SpringDI.Services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    public void SetUp(){
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new ConstructorGreetingService();

    }

    @Test
    void sayGreetings() {
       System.out.println(propertyInjectedController.sayGreetings());
    }
}