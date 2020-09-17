package com.estudos.restmysql.controller;

import com.estudos.restmysql.model.Book;
import com.estudos.restmysql.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/study")
public class StudyController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping
    public ResponseEntity<?> studyGET() {

        //bookRepository.save(new Book(0L, "ttt", "tttt", String.valueOf(new Random().nextLong())));

        //List<Book> books = bookRepository.findByOrderByIsbnDesc();
        //List<Book> books = bookRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));

        List<Book> books = bookRepository.findMaioresQueId5();

        return ResponseEntity.ok(books);
    }
}
