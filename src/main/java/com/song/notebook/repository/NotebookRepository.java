package com.song.notebook.repository;

import java.util.List;

import com.song.notebook.entity.Notebook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface NotebookRepository extends CrudRepository<Notebook, Long> {
    
    List<Notebook> findByName(String name);
    
}
