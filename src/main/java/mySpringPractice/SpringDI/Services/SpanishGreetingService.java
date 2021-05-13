package mySpringPractice.SpringDI.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile("ES")
//@Service("languageProfileService")
public class SpanishGreetingService implements IGreetingService{
    @Override
    public String sayGreetings() {
        return "Hola in Spanish - ES";
    }
}
