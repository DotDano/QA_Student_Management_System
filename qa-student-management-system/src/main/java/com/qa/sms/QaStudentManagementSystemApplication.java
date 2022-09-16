package com.qa.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.qa.sms*"})
public class QaStudentManagementSystemApplication {

	//implements CommandLineRunner
	public static void main(String[] args) {
		SpringApplication.run(QaStudentManagementSystemApplication.class, args);
	}
	
	//@Autowired
	//private StudentRepository studentRepository;
	
	//@Override
	//public void run(String... args) throws Exception {
		/*
		Student student1 = new Student("Dorothe", "Dano","dd@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("Saadat", "Teacher","st@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("Thomas", "BigBoss","tb@gmail.com");
		studentRepository.save(student3);
		
		Student student4 = new Student("Annop", "BabyBoss","ab@gmail.com");
		studentRepository.save(student4);
		*/
	}


