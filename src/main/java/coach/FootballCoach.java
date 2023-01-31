package coach;
import fortuneServices.FortuneService;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Get in, my son";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
