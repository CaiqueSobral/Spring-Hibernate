package com.luv2code.springdemo;

public class CricketCoach implements Coach {

  private FortuneService fortuneService;

  // add new fields for email address and team
  private String emailAddress;
  private String team;

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    System.out.println("CricketCoach: inside setter method - setEmailAddress");
    this.emailAddress = emailAddress;
  }

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    System.out.println("CricketCoach: inside setter method - setTem");
    this.team = team;
  }

  // Create a no-arg constructor
  public CricketCoach() {
    System.out.println("CricketCoach: inside no-arg constructor");
  }

  // Our setter method
  public void setFortuneService(FortuneService fortuneService) {
    System.out.println("CricketCoach: inside setFortuneService() method");
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Practice fast bowling for 15 minutes";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }
  
}
