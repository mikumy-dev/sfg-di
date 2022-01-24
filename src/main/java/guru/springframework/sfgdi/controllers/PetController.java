package guru.springframework.sfgdi.controllers;

import com.springframework.pet.services.PetService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String sayPets() {
        return petService.getPets() + " are the best!";
    }
}
