package mySpringPractice.SpringDI.Services;

import org.springframework.stereotype.Service;

//@Service
public class PropertyGreetingService implements IGreetingService{
    @Override
    public String sayGreetings() {
        return "Hello I'm implementing - Property";
    }
}
