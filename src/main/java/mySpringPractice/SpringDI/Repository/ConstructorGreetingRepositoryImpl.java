package mySpringPractice.SpringDI.Repository;


import mySpringPractice.SpringDI.Services.ConstructorGreetingService;

public class ConstructorGreetingRepositoryImpl implements ConstructorGreetingRopository{

    @Override
    public String getGreetings() {
        return "Hello I'm implementing - Constructor";
    }
}
