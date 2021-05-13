package mySpringPractice.SpringDI.Controllers;

import mySpringPractice.SpringDI.Repository.ConstructorGreetingRepositoryImpl;
import mySpringPractice.SpringDI.Services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorIntjectedControllerTest {

    private ConstructorIntjectedController constructorIntjectedController;
    @BeforeEach
    void setUp() {
        constructorIntjectedController = new ConstructorIntjectedController(new ConstructorGreetingService(new ConstructorGreetingRepositoryImpl()));

    }

    @Test
    void sayGreetings() {
        System.out.println(constructorIntjectedController.sayGreetings());
    }
}