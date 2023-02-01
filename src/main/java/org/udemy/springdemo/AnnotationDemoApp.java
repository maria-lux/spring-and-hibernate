package org.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.udemy.springdemo.coaches.Coach;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");

        // default bean id is class name in camelCase
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        Coach volleyballCoach = context.getBean("volleyballCoach", Coach.class);
        System.out.println(volleyballCoach.getDailyWorkout());
        System.out.println(volleyballCoach.getDailyFortune());

        Coach swimCoach = context.getBean("swimCoach", Coach.class);
        System.out.println(swimCoach.getDailyFortune());

        context.close();

    }
}
