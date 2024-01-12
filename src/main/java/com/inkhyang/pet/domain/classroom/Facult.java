package com.inkhyang.pet.domain.classroom;


import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

public class Facult {
    private String name;
    private List<Group> groups;

    private UUID id;

    public Facult(String name, List<Group> groups) {
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

    public List<Group> getGroups() {
        return groups;
    }

    public UUID getId() {
        return id;
    }

    public void addGroup(Group group){
        this.groups.add(group);
    }

    public void removeGroup(Group group){
        this.groups.remove(group);
    }
}
