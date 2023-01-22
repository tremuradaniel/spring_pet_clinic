package model;

import java.time.LocalTime;

public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalTime birthdate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalTime getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalTime birthdate) {
        this.birthdate = birthdate;
    }
}
