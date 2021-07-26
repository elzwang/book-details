package com.graphqljava.tutorial.bookdetails.book;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class Book {
    UUID id;
    String name;
    Author author;
    Genre genre;
//    List<Review> reviews;
}
