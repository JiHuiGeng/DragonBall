package com.cloudinary.dragonball;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.cloudinary.dragonball.mapper")
public class DragonBallApplication {

  public static void main(String[] args) {
    SpringApplication.run(DragonBallApplication.class, args);
  }

}
