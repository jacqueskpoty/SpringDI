package mySpringPractice.SpringDI.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Service("petService")
//@Profile("CAT")
public class CatPetService implements IPetService{
    @Override
    public String getBestPet() {
        return "Cat is the best";
    }
}
