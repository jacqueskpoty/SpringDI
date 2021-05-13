package mySpringPractice.SpringDI.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Service("petService")
//@Profile({"DOG","default"})
public class DogPetService implements IPetService {
    @Override
    public String getBestPet() {
        return "Dog is the best";
    }
}
