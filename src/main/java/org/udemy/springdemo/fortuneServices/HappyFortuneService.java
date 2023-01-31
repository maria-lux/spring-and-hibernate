package org.udemy.springdemo.fortuneServices;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "'Tis your lucky day!";
    }
}
