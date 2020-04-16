package springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	public void cleanup() {
		System.out.println("Clean up");
	}
	@Override
	public String getDailyFortune() {
		return(this.fortuneService.getFortune());
	}
	@Override
	public String getDailyWorkout() {
		return("Run a hard 5k");
	}
	public void startup() {
		System.out.println("Start up");
	}
}