package com.kodilla;

import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Square;
import com.kodilla.spring.shape.Triangle;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class KodillaSpringApplicationTests {

    @Test
    void testCircleLoadingIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean("circle");
        //When
        String name = shape.getShapeName();
        //Then
        assertEquals("This is a Circle.", name);
        System.out.println("Circle");
    }

    @Test
    void testTriangleLoadingIntoContainer(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean("triangle");
        //When
        String name = shape.getShapeName();
        //Then
        assertEquals("This is a Triangle.", name);
        System.out.println("triangle");
    }

    @Test
    void testSquareLoadingIntoContainer(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean("createSquare");
        //When
        String name = shape.getShapeName();
        //Then
        assertEquals("This is a Square.", name);
        System.out.println("square");
    }

    @Test
    void testShapeLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean("chosenShape");

        //When
        String name = shape.getShapeName();

        //Then
        System.out.println("Chosen shape says: " + name);
    }



    @Test
    void contextLoads() {
    }

    //może być jedna metoda szukanie po stringu a inne po klasie?

}
