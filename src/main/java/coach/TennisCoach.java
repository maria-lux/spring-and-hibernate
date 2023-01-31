package coach;

import fortuneServices.FortuneService;
public class TennisCoach implements Coach {

    private FortuneService fortuneService;
    @Override
    public String getDailyWorkout() {
        return "C'mon Djoko!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
