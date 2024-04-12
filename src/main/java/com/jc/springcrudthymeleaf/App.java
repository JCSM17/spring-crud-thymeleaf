package com.jc.springcrudthymeleaf;

import com.jc.springcrudthymeleaf.model.Book;
import com.jc.springcrudthymeleaf.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);
        var repo = context.getBean((BookRepository.class));

        List<Book> books = List.of(
                new Book(null, "El Aleph", "Jorge Luis Borges", 1949, 150.0),
                new Book(null, "Cien años de soledad", "Gabriel García Márquez", 1967, 200.0),
                new Book(null, "La ciudad y los perros", "Mario Vargas Llosa", 1963, 180.0),
                new Book(null, "Rayuela", "Julio Cortázar", 1963, 180.0)
        );
        repo.saveAll(books);
    }
}