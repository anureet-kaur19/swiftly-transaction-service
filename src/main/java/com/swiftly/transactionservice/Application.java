package com.swiftly.transactionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.capgemini.aura")
public class Application {
  public static void main(String[] args) {
    System.out.print("Hello and welcome to Swiftly Transaction Service!");
    SpringApplication.run(Application.class, args);
  }

}
