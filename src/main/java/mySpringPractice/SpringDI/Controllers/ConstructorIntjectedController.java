package mySpringPractice.SpringDI.Controllers;

import mySpringPractice.SpringDI.Services.IGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorIntjectedController {

    private final IGreetingService greetingService;

    public ConstructorIntjectedController(@Qualifier("constructorGreetingService") IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreetings(){
        return greetingService.sayGreetings();
    }
}
