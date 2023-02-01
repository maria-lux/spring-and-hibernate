package org.udemy.springdemo.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.udemy.springdemo.fortuneServices.FortuneService;

// default bean id will be tennisCoach
// you can give it explicit bean id, e.g. "@Component("thatSillyCoach")
@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    // apply annotation directly to the field (field injection)
    // use qualifier annotation to specify the bean
    @Autowired
    @Qualifier("happyFortuneService")
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
