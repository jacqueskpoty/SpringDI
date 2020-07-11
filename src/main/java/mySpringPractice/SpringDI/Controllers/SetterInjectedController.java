package mySpringPractice.SpringDI.Controllers;

import mySpringPractice.SpringDI.Services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private IGreetingService greetingService;

    public IGreetingService getGreetingService() {
        return greetingService;
    }

    @Qualifier("setterGreetingService")
    @Autowired
    public void setGreetingService(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreetings(){
        return greetingService.sayGreetings();
    }
}
