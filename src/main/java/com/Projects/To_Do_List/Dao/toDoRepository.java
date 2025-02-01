package com.Projects.To_Do_List.Dao;

import com.Projects.To_Do_List.Entity.toDo_Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface toDoRepository extends JpaRepository<toDo_Entity, Integer> {
    // no coding required
}
