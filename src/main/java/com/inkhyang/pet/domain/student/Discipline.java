package com.inkhyang.pet.domain.student;

public enum Discipline {
    MATH("Math"), PHYS("Phys"), PE("PE"), LANGUAGE("Language");
    private String name;
    Discipline(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
