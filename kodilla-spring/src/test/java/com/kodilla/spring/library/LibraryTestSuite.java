package com.kodilla.spring.library;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
public class LibraryTestSuite {

    @Autowired
    private Library library;

    @Test
    public void testLoadFromDb(){
    //sygnatura - nazwa metody oraz ilosć i typ argumentów
        //Given
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Library library= context.getBean(Library.class);
        //When
        library.loadFromDb();
        //Then
        //do nothing
    }

    @Test
    public void testSaveToBd(){
        //Given
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Library library = context.getBean(Library.class);
        //When
        library.saveToDb();
        //Then
        //do nothing
    }

    @Test
    void testContext(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(LibraryConfig.class);
        //When & Then
        System.out.println("====Bean list:====>>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<<====Beans list====");
    }

}
