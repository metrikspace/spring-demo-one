package springdemo;

public class CricketCoach implements Coach {
	private String emailAddress;
	private FortuneService fortuneService;
	private String team;
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	@Override
	public String getDailyFortune() {
		return(this.fortuneService.getFortune());
	}
	@Override
	public String getDailyWorkout() {
		return("Practice fast bowling for 15 minutes");
	}
	public String getEmailAddress() {
		return(this.emailAddress);
	}
	public String getTeam() {
		return(this.team);
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	public void setTeam(String team) {
		this.team = team;
	}
}