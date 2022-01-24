package com.springframework.pet.services;

public class CatService implements PetService {
    @Override
    public String getPets() {
        return "Cats";
    }
}
