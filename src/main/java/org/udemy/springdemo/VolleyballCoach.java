package org.udemy.springdemo;

import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach {

    private FortuneService fortuneService;

    public VolleyballCoach(FortuneService fortuneService) {
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
