package com.springframework.pet.services;

public class DogService implements PetService {
    @Override
    public String getPets() {
        return "Dogs";
    }
}
