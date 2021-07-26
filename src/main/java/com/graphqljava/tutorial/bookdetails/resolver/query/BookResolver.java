package com.graphqljava.tutorial.bookdetails.resolver.query;

import com.graphqljava.tutorial.bookdetails.book.Author;
import com.graphqljava.tutorial.bookdetails.book.Book;
import com.graphqljava.tutorial.bookdetails.book.Genre;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class BookResolver implements GraphQLQueryResolver {
    public Book book(UUID id) {
        log.info("Retrieving book details | id={}", id);
        return Book.builder()
                .id(id)
                .name("Magic Tree House")
                .author(new Author("Mary", "P", "Osborne"))
                .genre(Genre.FICTION)
                .build();
    }

}
