package mySpringPractice.SpringDI.Controllers;

import mySpringPractice.SpringDI.Services.IGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final IGreetingService greetingService;

    public  MyController(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String HelloWorld(){
        return greetingService.sayGreetings();
    }
}
