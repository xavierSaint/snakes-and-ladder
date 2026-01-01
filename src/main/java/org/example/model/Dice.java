package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Dice {
    private int noOfDice;

    public int roll() {
       int sum = 0;
       for (int i=0;i<noOfDice;i++) {
           sum += (int) (Math.random()*(6) + 1);
       }
       return sum;
    }
}
