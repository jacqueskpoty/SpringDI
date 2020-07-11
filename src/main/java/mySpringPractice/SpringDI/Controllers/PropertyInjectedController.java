package mySpringPractice.SpringDI.Controllers;

import mySpringPractice.SpringDI.Services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingService")
    @Autowired
    public IGreetingService greetingService;

    public String sayGreetings(){
        return greetingService.sayGreetings();
    }
}
