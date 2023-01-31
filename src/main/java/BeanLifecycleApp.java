import coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/beanLifecycle-applicationContext.xml");
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        context.close();

    }
}
