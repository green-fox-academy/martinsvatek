package com.listingtodos.database.repositories;

import com.listingtodos.database.models.ToDo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

// Create a new interface which extends CrudRepository<Todo, Long>

@Repository // you need to call Autowired in controller
public interface ToDoRepo extends CrudRepository<ToDo,Long> { // ToDo is our model, Long define our variable, CrudRepository connecting our database


    // Extend the listing method with a request parameter for listing the active Todos (active means !isDone).
    // If you write http://localhost:8080/todo/?isActive=true, then only those todos which are not done yet should be listed.

    @Query(value = "SELECT * FROM to_do WHERE done = true",
            nativeQuery=true
    )
    public List<ToDo> findDone();

}