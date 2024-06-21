package br.com.lucastribioli.spring_aop_study.classTest;
import org.springframework.stereotype.Service;

@Service
public class ClassForTest {
    
    public void methodForTest() {
        System.out.println("Hello, World!, I was executed! :) ");
    }
    
}
