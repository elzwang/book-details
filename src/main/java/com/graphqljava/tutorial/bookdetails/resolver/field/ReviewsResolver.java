package com.graphqljava.tutorial.bookdetails.resolver.field;

import com.graphqljava.tutorial.bookdetails.book.Book;
import com.graphqljava.tutorial.bookdetails.book.Review;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class ReviewsResolver implements GraphQLResolver<Book> {

    // must be the same name as the field
    // when the book() query is called, book will pass itself into the reviews field resolver
    public List<Review> reviews(Book book) {
        log.info("Requesting reviews data for book with id {}", book.getId());
        List<Review> reviewList = new ArrayList<>();
        reviewList.add(new Review(5, "Best book ever!"));
        reviewList.add(new Review(1, "Didn't help me sleep at all. 1-star from me."));
        return reviewList;
    }
}
