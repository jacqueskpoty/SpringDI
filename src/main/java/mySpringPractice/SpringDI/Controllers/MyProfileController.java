package mySpringPractice.SpringDI.Controllers;

import mySpringPractice.SpringDI.Services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyProfileController {

    private final IGreetingService greetingService;

    public MyProfileController(@Qualifier("languageProfileService")IGreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String HelloWorldProfile(){
        return greetingService.sayGreetings();
    }
}
