package com.inkhyang.pet.domain;

import java.time.LocalDate;

public class Mark {


    private LocalDate date;

    private Discipline discipline;

    private Score score;

    public Mark(Discipline discipline, Score score) {
        this.date = LocalDate.now();
        this.discipline = discipline;
        this.score = score;
    }


    public LocalDate getDate() {
        return date;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public Score getScore() {
        return score;
    }
}
