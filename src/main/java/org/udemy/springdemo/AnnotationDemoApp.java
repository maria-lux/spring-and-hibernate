package org.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.udemy.springdemo.coaches.Coach;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");

        // default bean id is class name in camelCase
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        //Coach volleyCoach = context.getBean("volleyballCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        //System.out.println(volleyCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        context.close();

    }
}
