package org.udemy.springdemo.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.udemy.springdemo.fortuneServices.FortuneService;

@Component
public class VolleyballCoach implements Coach {

    //@Autowired
    //@Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // using @Qualifier with a constructor
    @Autowired
    public VolleyballCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "50 push-ups to get going";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
