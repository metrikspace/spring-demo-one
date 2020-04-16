package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("contexts/application.xml");
		
		Coach theCoachOne = context.getBean("coachOne", Coach.class);
		System.out.println(theCoachOne.getDailyWorkout());
		System.out.println(theCoachOne.getDailyFortune());
		System.out.print("\n");
		
		CricketCoach theCoachTwo = context.getBean("coachTwo", CricketCoach.class);
		System.out.println(theCoachTwo.getDailyWorkout());
		System.out.println(theCoachTwo.getDailyFortune());
		System.out.println(theCoachTwo.getEmailAddress());
		System.out.println(theCoachTwo.getTeam());
		
		context.close();
	}
}