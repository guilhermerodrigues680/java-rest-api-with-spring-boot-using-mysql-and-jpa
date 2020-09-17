package com.estudos.restmysql.repository;

import com.estudos.restmysql.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    // Ordena pelo nome do metodo
    //List<Book> findByOrderByIsbnDesc();

    // Seleciona todos maiores que um ID
    @Query("SELECT b FROM Book b WHERE b.id > 5")
    List<Book> findMaioresQueId5();
}
