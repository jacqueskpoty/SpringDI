package mySpringPractice.SpringDI.Services;

public class PetFactoryService {

    public IPetService petService(String type){
        switch (type){
            case "DOG":
                return new DogPetService();
            case "CAT":
                return new CatPetService();
            default:
                return null;
        }
    }
}
