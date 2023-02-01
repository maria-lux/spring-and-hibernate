package org.udemy.springdemo.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.udemy.springdemo.fortuneServices.FortuneService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// default bean id will be tennisCoach
// you can give it explicit bean id, e.g. "@Component("thatSillyCoach")
@Component
//@Scope("prototype")
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

    // define my init method
    @PostConstruct
    public void doSomeStartUpStuff(){
        System.out.println("doSomeStartUpStuff()");
    }

    // define my destroy method
    @PreDestroy
    public void doSomeCleanUpStuff(){
        System.out.println("doSomeCleanUpStuff()");
    }

}
