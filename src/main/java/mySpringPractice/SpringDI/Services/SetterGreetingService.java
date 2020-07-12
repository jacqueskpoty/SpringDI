package mySpringPractice.SpringDI.Services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements IGreetingService{
    @Override
    public String sayGreetings() {
        return "Hello I'm implementing - Setters";
    }
}

