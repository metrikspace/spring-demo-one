package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("contexts/application2.xml");
		
		Coach coachOne = context.getBean("singletonCoach", Coach.class);
		Coach coachTwo = context.getBean("singletonCoach", Coach.class);
		System.out.println("Memory of coachOne"+coachOne);
		System.out.println("Memory of coachTwo"+coachTwo);
		System.out.println(coachOne == coachTwo);
		
		Coach coachThree = context.getBean("prototypeCoach", Coach.class);
		Coach coachFour = context.getBean("prototypeCoach", Coach.class);
		System.out.println("Memory of coachThree"+coachThree);
		System.out.println("Memory of coachFour"+coachFour);
		System.out.println(coachThree == coachFour);
		
		context.close();
	}
}