package com.inkhyang.pet.journal;

import java.time.LocalDate;
import java.util.Date;

public class Mark {
    private LocalDate date;
    private Discipline discipline;
    private Marks marks;

    public Mark(Discipline discipline, Marks marks) {
        this.date = LocalDate.now();
        this.discipline = discipline;
        this.marks = marks;
    }

    public LocalDate getDate() {
        return date;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public Marks getMark() {
        return marks;
    }
}
