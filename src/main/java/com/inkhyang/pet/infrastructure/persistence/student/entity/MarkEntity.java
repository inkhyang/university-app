package com.inkhyang.pet.infrastructure.persistence.student.entity;

import com.inkhyang.pet.infrastructure.persistence.AbstractEntity;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "marks")
public class MarkEntity extends AbstractEntity {


    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private String discipline;

    @Column(nullable = false)
    private Integer score;

    @ManyToOne(fetch = FetchType.LAZY)
    private StudentEntity student;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public StudentEntity getStudent() {
        return student;
    }

    public void setStudent(StudentEntity student) {
        this.student = student;
    }
}
