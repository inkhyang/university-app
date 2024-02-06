package com.inkhyang.pet.infrastructure.persistence.student.entity;

import com.inkhyang.pet.infrastructure.persistence.AbstractEntity;
import com.inkhyang.pet.infrastructure.persistence.classroom.entity.GroupEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "students")
public class StudentEntity extends AbstractEntity {

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MarkEntity> marks;

    @ManyToOne(fetch = FetchType.LAZY)
    private GroupEntity group;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<MarkEntity> getMarks() {
        return marks;
    }

    public void setMarks(List<MarkEntity> marks) {
        this.marks = marks;
    }

    public GroupEntity getGroup() {
        return group;
    }

    public void setGroup(GroupEntity group) {
        this.group = group;
    }
}
