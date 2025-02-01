package com.Projects.To_Do_List.Service;

import com.Projects.To_Do_List.Entity.toDo_Entity;

import java.util.List;

public interface toDoService {
    List<toDo_Entity> findAll();

    toDo_Entity findById(int theId);

    toDo_Entity save(toDo_Entity theEmployee);

    void deleteById(int theId);
}
