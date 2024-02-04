package com.inkhyang.pet.infrastructure.persistance.classroom.entity;


import com.inkhyang.pet.infrastructure.persistance.AbstractEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "facults")
public class FacultEntity extends AbstractEntity {
    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "facult", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GroupEntity> groups;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GroupEntity> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupEntity> groups) {
        this.groups = groups;
    }
}