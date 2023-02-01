package org.udemy.springdemo.fortuneServices;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("happyFortuneService")
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "'Tis your lucky day!";
    }
}
