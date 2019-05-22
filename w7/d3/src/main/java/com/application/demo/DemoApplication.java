package com.application.demo;

import com.application.demo.Models.MyColor;
import com.application.demo.Services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private Printer printer;
    private MyColor red;
    private MyColor yellow;

    @Autowired // provides more fine-grained control over where and how autowiring should be accomplished.
    DemoApplication(Printer printer, @Qualifier("red") MyColor red, @Qualifier("yellow") MyColor yellow) {
        this.printer = printer;
        this.red = red;
        this.yellow = yellow;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("hello");
        red.printColor();
        yellow.printColor();
    }
}