package org.udemy.springdemo.fortuneServices;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("randomFortuneService")
public class RandomFortuneService implements FortuneService {

    private final String[] fortunes = {"Today is your lucky day", "Fat chance, loser", "Try again tomorrow"};

    @Override
    public String getFortune() {
        //double fortuneNumber = Math.floor(Math.random() * 3);
        //return fortunes[(int) fortuneNumber];

        // alternative way to create a random number generator
        // in order to pick a random fortune from the array
        Random random = new Random();
        int index = random.nextInt(fortunes.length);

        return fortunes[index];
    }
}
