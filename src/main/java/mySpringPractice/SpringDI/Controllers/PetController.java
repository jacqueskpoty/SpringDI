package mySpringPractice.SpringDI.Controllers;

import mySpringPractice.SpringDI.Services.IPetService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    IPetService iPetService;
    public PetController(IPetService iPetService){
        this.iPetService = iPetService;
    }

    public String getBestPet(){
        return iPetService.getBestPet();
    }
}
