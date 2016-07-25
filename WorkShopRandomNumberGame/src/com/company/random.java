package com.company;

import java.util.Random;

/**
 * Created by Farrukh's on 25-Jul-16.
 */
public interface random {


    Random com_guess = new Random();
    int com = 1+com_guess.nextInt(9);

    void won();
    void lose();
    void chance();



}
