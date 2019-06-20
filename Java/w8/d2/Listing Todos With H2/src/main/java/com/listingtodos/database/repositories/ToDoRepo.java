package com.listingtodos.database.repositories;

import com.listingtodos.database.models.ToDo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

// Create a new interface which extends CrudRepository<Todo, Long>

@Repository // you need to call Autowired in controller
public interface ToDoRepo extends CrudRepository<ToDo,Long> { // ToDo is our model, Long define our variable, CrudRepository connecting our database

    // @Query(value = "SELECT * FROM to_do WHERE done = true", nativeQuery=true)

    List<ToDo> findAllByDone(boolean done);

    List<ToDo> findAllByTitleLikeIgnoreCaseOrderById(String word);
}