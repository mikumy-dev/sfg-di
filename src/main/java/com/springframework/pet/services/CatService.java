package com.springframework.pet.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("cat")
@Service
public class CatService implements PetService {
    @Override
    public String getPets() {
        return "Cats";
    }
}
