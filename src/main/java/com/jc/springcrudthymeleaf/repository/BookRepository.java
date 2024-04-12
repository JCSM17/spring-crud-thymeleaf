package com.jc.springcrudthymeleaf.repository;

import com.jc.springcrudthymeleaf.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
