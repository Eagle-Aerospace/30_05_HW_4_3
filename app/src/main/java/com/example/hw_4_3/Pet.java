package com.example.hw_4_3;

public class Pet {

    //поля сущности
    private String petName;
    private String petDescription;
    private int petResourse;
    private String habitat;

    public Pet(String name, String petDescription, int petResourse, String habitat) {
        this.petName = name;
        this.petDescription = petDescription;
        this.petResourse = petResourse;
        this.habitat = habitat;
    }

    public String getName() {
        return petName;
    }

    public void setName(String name) {
        this.petName = name;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public void setPetDescription(String petDescription) {
        this.petDescription = petDescription;
    }

    public int getPetResourse() {
        return petResourse;
    }

    public void setPetResourse(int petResourse) {
        this.petResourse = petResourse;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

}
