package com.inkhyang.pet.domain.journal;

public enum Marks {
    A(5), B(4), C(3), D(2), F(1);
    private int value;
    Marks(int value) {
        this.value = value;
    }
}
