package com.graphqljava.tutorial.bookdetails.book;

import lombok.Value;

@Value
public class Review {
    int rating;
    String summary;
}
