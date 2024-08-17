package com.vardant.movies;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "movies")
@Data // Take care of getter setters
@AllArgsConstructor // Create a constructer with private fields
@NoArgsConstructor // Create a constructer with fields and takes no parameter
public class Movie {

    // Parameters match the database colums

    @Id
    private ObjectId id;

    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;

    private List<String> genres;
    private List<String> backdrops;

    @DocumentReference // Cause database to store id of review, review in a separate collection
    private List<Review> reviewIds;

}
