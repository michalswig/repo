package com.kodilla.spring.library;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfig {
//    @Configuration, co informuje Springa o tym, że należy użyć metod produkujących beany z tej klasy do skonfigurowania zależności pomiędzy beanami.
    @Bean
    public Library library(){
        return new Library(libraryDbController());
    }
    @Bean
    public LibraryDbController libraryDbController(){
        return new LibraryDbController();
    }

}
