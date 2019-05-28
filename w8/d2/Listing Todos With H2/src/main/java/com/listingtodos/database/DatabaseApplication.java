package com.listingtodos.database;

import com.listingtodos.database.models.ToDo;
import com.listingtodos.database.repositories.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseApplication { // implements CommandLineRunner { // implement commandlinerunner

    // Inject the new repository

    private ToDoRepo toDoRepo;

    @Autowired // connected with Repository
    public DatabaseApplication(ToDoRepo toDoRepo) {
        this.toDoRepo = toDoRepo;
    }

    public static void main(String[] args) {
        SpringApplication.run(DatabaseApplication.class, args);
    }

/*  @Override // commented after finished 2nd task
    public void run(String... args) throws Exception { // create run method
        toDoRepo.save(new ToDo("Clean your room!"));
        toDoRepo.save(new ToDo("Do homework!"));

        System.out.println(toDoRepo.count());
    }*/
}