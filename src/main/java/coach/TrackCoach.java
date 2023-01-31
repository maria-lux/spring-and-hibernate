package coach;

import coach.Coach;
import fortuneServices.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Run a hard 10k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff(){
        System.out.println("TrackCoach: doMyStartupStuff");
    }
    // add a destroy method
    public void doMyCleanupStuff(){
        System.out.println("TrackCoach: doMyCleanupStuff");
    }
}
