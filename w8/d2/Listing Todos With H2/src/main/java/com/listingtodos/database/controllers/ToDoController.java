package com.listingtodos.database.controllers;

import com.listingtodos.database.models.ToDo;
import com.listingtodos.database.repositories.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/todo")
public class ToDoController {

    private ToDoRepo toDoRepo; // Inject the new repository into the controller

    @Autowired // connected with Repository
    public ToDoController(ToDoRepo toDoRepo) {
        this.toDoRepo = toDoRepo;
    }

    @GetMapping(value = {"/","/list"}) // define what will show us this url address
    public String listOfToDos(Model model, @RequestParam(value = "isDone", defaultValue = "false") boolean done) {

        if (done) {
            model.addAttribute("todos", toDoRepo.findDone());
        } else {
            model.addAttribute("todos", toDoRepo.findAll()); // when you use "todos" in html, it gives you all from repo
        }
        return "todolist";
    }

    @PostMapping("/addtodo")
    public String addNewToDo(@RequestParam(name = "todo") String newTodo, @RequestParam(name = "isUrgent") boolean urgent) {
        toDoRepo.save(new ToDo(newTodo, urgent));
        return "redirect:/todo/list";
    }

    @GetMapping("/addtodo")
    public String addNewToDo() {
        return "addtodo";
    }

    @GetMapping("/{id}/delete")
    public String deleteToDo(@PathVariable(name = "id") long id) {
        toDoRepo.deleteById(id);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/update")
    public String updateToDo(@PathVariable(name = "id") long id, Model model) {
        model.addAttribute("todoTitle", toDoRepo.findById(id).get().getTitle());
        model.addAttribute("todo", toDoRepo.findById(id));
        return "update";
    }

}