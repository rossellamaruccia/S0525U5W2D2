package com.example.S0525U5W2D2.Entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Blog {
    private long id;
    private String category;
    private String title;
    private String cover;
    private String content;
    private double readingTime;

    public Blog(String title, String category, String cover, String content, double readingTime) {
        this.category = category;
        this.title = title;
        this.cover = cover;
        this.content = content;
        this.readingTime = readingTime;
    }
}
