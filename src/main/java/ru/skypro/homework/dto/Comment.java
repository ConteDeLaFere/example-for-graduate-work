package ru.skypro.homework.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
public class Comment {

    private int pk;
    private int author;
    private String authorImage;
    private LocalDateTime createdAt;
    private String text;

}
