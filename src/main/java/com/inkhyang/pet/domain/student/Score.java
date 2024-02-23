package com.inkhyang.pet.domain.student;

import java.util.Arrays;

public enum Score {
    A(5), B(4), C(3), D(2), F(1);
    private int value;
    Score(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Score valueOf(Integer score){
        return Arrays.stream(Score.values())
                .filter(it -> it.value == score)
                .findFirst()
                .orElseThrow();
    }
}
