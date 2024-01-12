package com.inkhyang.pet.domain.classroom;


import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

public class Facult {
    private String name;
    private List<Student> groups;

    private UUID id;

    public Facult(String name, List<Student> groups) {
        this.name = name;
        this.groups = groups;
        this.id = UUID.randomUUID();
    }

    public Facult(String name) {
        this.name = name;
        this.groups = new ArrayList<>();
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public List<Student> getGroups() {
        return groups;
    }

    public UUID getId() {
        return id;
    }

    public void addGroup(Student group){
        this.groups.add(group);
    }

    public void removeGroup(Student group){
        this.groups.remove(group);
    }
}
