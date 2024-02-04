package com.inkhyang.pet.infrastructure.persistance.classroom.entity;

import com.inkhyang.pet.infrastructure.persistance.AbstractEntity;
import com.inkhyang.pet.infrastructure.persistance.student.entity.StudentEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "groups")
public class GroupEntity extends AbstractEntity {
    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StudentEntity> students;

    @ManyToOne(fetch = FetchType.LAZY)
    private FacultEntity facult;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentEntity> getStudents() {
        return students;
    }

    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }

    public FacultEntity getFacult() {
        return facult;
    }

    public void setFacult(FacultEntity facult) {
        this.facult = facult;
    }
}
