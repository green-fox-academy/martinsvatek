package com.listingtodos.database.controllers;

import com.listingtodos.database.models.ToDo;
import com.listingtodos.database.repositories.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// Create a new controller called TodoController which maps to /todo

@Controller
@RequestMapping(value = "/todo")
public class ToDoController {

    // Inject the new repository into the controller

    private ToDoRepo toDoRepo;

/*  @Autowired // connected with Repository, commented after second exercise
    public ToDoController(ToDoRepo toDoRepo) {
        this.toDoRepo = toDoRepo;
    }*/

    @Autowired // connected with Repository
    public ToDoController(ToDoRepo toDoRepo) {
        this.toDoRepo = toDoRepo;
        toDoRepo.save(new ToDo("Clean your room!", true, false));
        toDoRepo.save(new ToDo("Do homework!", false, false));
        toDoRepo.save(new ToDo("Run!", true, false));
        toDoRepo.save(new ToDo("Learn English yourself", false, false));
    }

    // Add a public String list() method which maps to / and /list in the controller, which returns with
    // "This is my first Todo" string. Use the @ResponseBody annotation.

    @GetMapping(value = {"/","/list"})
    //  @ResponseBody - you can return string without using Model model
    public String list(Model model) {

        // In the list method of the Controller use the repository to find all elements
        // and add them to the model as "todos" attribute

        model.addAttribute("todos", toDoRepo.findAll()); // when you ise "todos" in html, it gives you all from repo
        return "todolist";
    }

    @GetMapping(value = {"/","/list"})
    public String list(Model model, @RequestParam(value = "isDone", defaultValue = "false") boolean done) {
        if (done) {
            model.addAttribute("todos", toDoRepo.fi());
        } else

        model.addAttribute("todos", toDoRepo.findAll()); // when you ise "todos" in html, it gives you all from repo
        return "todolist";
    }
}