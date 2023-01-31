package org.udemy.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// default bean id will be tennisCoach
// you can give it explicit bean id, e.g. "@Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach {

    // apply annotation directly to the field (field injection)
    @Autowired
    private FortuneService fortuneService;

    // dependency injection using constructor
    /*@Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    // dependency injection using setter
    /*@Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // dependency injection using any other method
    /*@Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

}
