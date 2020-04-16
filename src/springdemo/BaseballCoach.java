package springdemo;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyFortune() {
		return(this.fortuneService.getFortune());
	}
	@Override
	public String getDailyWorkout() {
		return("Spend 30 minutes on batting practice");
	}
}