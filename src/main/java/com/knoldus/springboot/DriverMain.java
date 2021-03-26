package com.knoldus.springboot;

import org.springframework.boot.SpringApplication;

/**
 * Class with main method that runs SpringBoot Application.
 */
public final class DriverMain {
  private DriverMain() { }
  /**
   * main method runs spring boot Application.
   * @param args String array.
   */

  public static void main(final String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
