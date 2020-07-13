package mySpringPractice.SpringDI.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN","default"})
@Service("languageProfileService")
public class EnglishGreetingService implements IGreetingService{
    @Override
    public String sayGreetings() {
        return "Hello in English - EN";
    }
}
