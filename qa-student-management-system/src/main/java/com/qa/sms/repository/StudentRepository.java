package com.qa.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
	

}
