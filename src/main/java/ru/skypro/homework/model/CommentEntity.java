package ru.skypro.homework.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @CreationTimestamp
    private LocalDateTime createdAt;

    private String text;

    @ManyToOne(fetch = FetchType.LAZY)
    @NonNull
    private UserEntity user;

    @ManyToOne(fetch = FetchType.LAZY)
    @NonNull
    private AdEntity ad;

    public CommentEntity(LocalDateTime createdAt, String text) {
        this.createdAt = createdAt;
        this.text = text;
    }
}
