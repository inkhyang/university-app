package com.inkhyang.pet.domain.classroom;


import java.util.ArrayList;
import java.util.List;

public class Facult {
    private FacultId id;
    private String name;
    private List<Group> groups;

    public record FacultId(String name){
    }

    public Facult(String name, List<Group> groups) {
        this.id = new FacultId(name);
        this.name = name;
        this.groups = groups;
    }

    public Facult(String name) {
        this.id = new FacultId(name);
        this.name = name;
        this.groups = new ArrayList<>();
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

    public void addGroup(Group group) {
        this.groups.add(group);
    }

    public void removeGroup(Group group) {
        this.groups.remove(group);
    }
}
