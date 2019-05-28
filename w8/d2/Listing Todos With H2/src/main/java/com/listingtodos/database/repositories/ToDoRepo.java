package com.listingtodos.database.repositories;

import com.listingtodos.database.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Create a new interface which extends CrudRepository<Todo, Long>

@Repository // you need to call Autowired in controller
public interface ToDoRepo extends CrudRepository<ToDo,Long> { // ToDo is our model, Long define our variable, CrudRepository connecting our database


}