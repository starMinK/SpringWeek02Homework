package com.week02homework.week02homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Week02homeworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week02homeworkApplication.class, args);
		System.out.println("서버 실행됨");
	}

}
