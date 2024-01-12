package com.inkhyang.pet.classroom;

import java.util.ArrayList;
import java.util.List;

public class Facult {
    private String name;
    private List<Group> groups;

    public Facult(String name, List<Group> groups) {
        this.name = name;
        this.groups = groups;
    }

    public Facult(String name) {
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
    //add group, remove group
    public void addGroup(Group group){
        this.groups.add(group);
    }

    public void removeGroup(Group group){
        this.groups.remove(group);
    }
}
