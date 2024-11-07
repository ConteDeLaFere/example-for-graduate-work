package ru.skypro.homework.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ads")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class AdEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String image;
    private int price;
    private String title;
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @NonNull
    private UserEntity user;

    @OneToMany(mappedBy = "ad", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CommentEntity> comments;

    public AdEntity(String image, int price, String title, String description) {
        this.image = image;
        this.price = price;
        this.title = title;
        this.description = description;
    }
}
