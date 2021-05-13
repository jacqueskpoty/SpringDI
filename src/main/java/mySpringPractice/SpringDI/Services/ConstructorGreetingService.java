package mySpringPractice.SpringDI.Services;

import mySpringPractice.SpringDI.Repository.ConstructorGreetingRopository;
import org.springframework.stereotype.Service;

//@Service
public class ConstructorGreetingService implements IGreetingService{

    ConstructorGreetingRopository constructorGreetingRopository;

    public ConstructorGreetingService(ConstructorGreetingRopository constructorGreetingRopository) {
        this.constructorGreetingRopository = constructorGreetingRopository;
    }

    @Override
    public String sayGreetings() {
        return constructorGreetingRopository.getGreetings();
    }
}
