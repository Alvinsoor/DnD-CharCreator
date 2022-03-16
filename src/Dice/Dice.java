package Dice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//Mostly obtained from https://stackoverflow.com/questions/32748203/having-trouble-with-my-dungeons-and-dragons-dice-roller
public class Dice {
    Random rand;

    public Dice() {
        this.rand = new Random();

    }

    public int rollSingleDie() {
        return rand.nextInt((6 - 1) + 1) + 1;
    }

    public int Roll4d6DropLowest() {         //If you want your rolls to be random
        int sum = 0;
        List<Integer> rollList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            rollList.add(rollSingleDie());
        }


        rollList.remove(Collections.min(rollList));


        for (Integer T : rollList
        ) {
            sum = sum + T;

        }

        if (sum < 10) {     //If the dice roll is too unfair, it rerolls
            sum = 0;
            Roll4d6DropLowest();
        }

        return sum;

    }
}
