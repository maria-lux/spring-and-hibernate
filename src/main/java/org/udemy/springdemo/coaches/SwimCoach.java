package org.udemy.springdemo.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.udemy.springdemo.fortuneServices.FortuneService;

@Component
public class SwimCoach implements Coach{

    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;
    @Override
    public String getDailyWorkout() {
        return "60 laps!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
