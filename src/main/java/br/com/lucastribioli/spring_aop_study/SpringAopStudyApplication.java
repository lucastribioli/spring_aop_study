package br.com.lucastribioli.spring_aop_study;

import br.com.lucastribioli.spring_aop_study.classTest.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@SpringBootApplication
public class SpringAopStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopStudyApplication.class, args);
	}


	@Bean
	ApplicationRunner init(ClassForTest classForTest) {
		return args -> {
			classForTest.methodForTest();
		};
	}

}
