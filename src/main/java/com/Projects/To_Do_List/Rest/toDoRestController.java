package com.Projects.To_Do_List.Rest;

import com.Projects.To_Do_List.Entity.toDo_Entity;
import com.Projects.To_Do_List.Service.toDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/toDo")
public class toDoRestController {

    private toDoService todoService;

    @Autowired
    public toDoRestController(toDoService theToDoService){
        todoService= theToDoService;
    }

    @GetMapping("/allTasks")
    public List<toDo_Entity> findAll(){
        return todoService.findAll();
    }

    @GetMapping("/allTasks/{toDoId}")
    public toDo_Entity findbyId(@PathVariable int toDoId){

        toDo_Entity demoTodo= todoService.findById(toDoId);

        if(demoTodo==null){
            throw new RuntimeException("No task with ID:"+toDoId+", is found");
        }

        return demoTodo;
    }

    @PostMapping("/allTasks")
    public toDo_Entity addTask(@RequestBody toDo_Entity demoToDo){
        // in case the id is passed is 0
        // it means a new entry is being made/forced

        demoToDo.setId(0);

        toDo_Entity dbToDo= todoService.save(demoToDo);
        return dbToDo;
    }

    @PutMapping("/allTasks")
    public toDo_Entity updateTask(@RequestBody toDo_Entity demoToDo){

        toDo_Entity dbToDo= todoService.save(demoToDo);
        return dbToDo;
    }

    @DeleteMapping("/allTasks/{toDoId}")
    public String deleteTask(@PathVariable int theId) {
        toDo_Entity dbToDo = todoService.findById(theId);

        if (dbToDo == null) {
            throw new RuntimeException("No task with ID:" + theId + ", was found");
        }

        todoService.deleteById(theId);
        return "The task with ID:" + theId + ", wis deleted";
    }
}











