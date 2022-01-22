package com.springframework.pet.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dog", "default"})
@Service
public class DogService implements PetService {
    @Override
    public String getPets() {
        return "Dogs";
    }
}
