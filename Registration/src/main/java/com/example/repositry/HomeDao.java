package com.example.repositry;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Student;

@Repository
public interface HomeDao extends CrudRepository<Student, Integer>{
	List<Student> findAll();
}
