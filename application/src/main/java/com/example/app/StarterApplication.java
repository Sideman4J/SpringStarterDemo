package com.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.example.starter.Greeter;

@SpringBootApplication
public class StarterApplication implements CommandLineRunner {

    // This fails: APPLICATION FAILED TO START [...]
    // required a bean of type 'com.example.starter.Greeter' that could not be found.
    @Autowired
    private Greeter greeter;

    public static void main(String[] args) {
        SpringApplication.run(StarterApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String message = greeter.greet();
        System.out.println(message);
    }
}
