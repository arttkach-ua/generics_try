package com.example.demo;

import com.example.demo.model.Circle;
import com.example.demo.model.Figure;
import com.example.demo.model.Rectangle;
import com.example.demo.service.ExampleRunnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner {
    private final ExampleRunnerService exampleRunnerService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {

    }
}
