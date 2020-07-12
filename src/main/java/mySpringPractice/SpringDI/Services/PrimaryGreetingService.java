package mySpringPractice.SpringDI.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements  IGreetingService{


    @Override
    public String sayGreetings() {
        return "Im implememting the primary greeting";
    }
}
