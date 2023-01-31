package fortuneServices;

import fortuneServices.FortuneService;

public class RandomFortuneService implements FortuneService {

    private final String[] fortunes = {"Today is your lucky day","Fat chance, loser","Try again tomorrow"};

    @Override
    public String getFortune() {
        double fortuneNumber = Math.floor(Math.random() * 3);
        return fortunes[(int) fortuneNumber];
    }
}
