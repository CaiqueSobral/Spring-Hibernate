package com.luv2code.springdemo;

public class MotorsportCoach implements Coach {
  
  @Override
  public String getDailyWorkout() {
    return "Practice your start!";
  }

  @Override
  public String getDailyFortune() {
    return null;
  }
}
