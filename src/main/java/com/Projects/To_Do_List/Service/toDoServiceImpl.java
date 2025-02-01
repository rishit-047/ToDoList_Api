package com.Projects.To_Do_List.Service;

import com.Projects.To_Do_List.Dao.toDoRepository;
import com.Projects.To_Do_List.Entity.toDo_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class toDoServiceImpl implements toDoService{

        private toDoRepository todoRepository;

        @Autowired
        public toDoServiceImpl(toDoRepository thetodoRepository) {
            todoRepository = thetodoRepository;
        }

        @Override
        public List<toDo_Entity> findAll() {

            return todoRepository.findAll();
        }

        @Override
        public toDo_Entity findById(int theId) {
            Optional<toDo_Entity> result = todoRepository.findById(theId);

            toDo_Entity theToDo = null;

            if (result.isPresent()) {
                theToDo = result.get();
            }
            else {
                // we didn't find the employee
                throw new RuntimeException("Did not find task id - " + theId);
            }

            return theToDo;
        }

        @Override
        public toDo_Entity save(toDo_Entity theToDo) {

            return todoRepository.save(theToDo);
        }

        @Override
        public void deleteById(int theId) {
            todoRepository.deleteById(theId);
        }


}
