package mySpringPractice.SpringDI.Services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements IGreetingService{
    @Override
    public String sayGreetings() {
        return "Hello I'm implementing - Constructor";
    }
}
