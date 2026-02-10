package com.example.S0525U5W2D2.Payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class NewBlogPayload {
    private long id;
    private String category;
    private String title;
    private String cover;
    private String content;
    private double readingTime;
}
