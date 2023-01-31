package coach;
import fortuneServices.FortuneService;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;
    private String email;
    private String team;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Crikey, boy!";
    }

    @Override
    public String getDailyFortune() {
        return "Young man! " + fortuneService.getFortune();
    }

}
