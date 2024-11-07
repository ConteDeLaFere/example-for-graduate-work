package ru.skypro.homework.mapper;

import lombok.experimental.UtilityClass;
import ru.skypro.homework.dto.Comment;
import ru.skypro.homework.model.CommentEntity;

@UtilityClass
public class CommentMapper {

    public static Comment toDto(CommentEntity commentEntity) {
        Comment comment = new Comment();

        comment.setPk(commentEntity.getId());
        comment.setAuthor(commentEntity.getUser().getId());
        comment.setAuthorImage(commentEntity.getUser().getImage());
        comment.setCreatedAt(commentEntity.getCreatedAt());
        comment.setText(commentEntity.getText());

        return comment;
    }
}
