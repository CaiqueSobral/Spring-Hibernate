package com.luv2code.springdemo;

public class CricketCoach implements Coach {

  private FortuneService fortuneService;

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
