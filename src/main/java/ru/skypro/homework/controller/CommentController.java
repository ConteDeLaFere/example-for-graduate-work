package ru.skypro.homework.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.skypro.homework.dto.Comment;

import java.util.List;

@RestController
@RequestMapping("/ads")
@RequiredArgsConstructor

public class CommentController {

    @GetMapping("/{id}/comments")
    public ResponseEntity<List<Comment>> getAdComments(@PathVariable int id) {
        return ResponseEntity.ok(null);
    }

    @PostMapping("/{id}/comments")
    public ResponseEntity<Comment> createAdComment(@PathVariable int id, @RequestBody Comment comment) {
        return ResponseEntity.ok(comment);
    }

    @DeleteMapping("/{adId}/comments/{commentId}")
    public ResponseEntity<Void> deleteAdComment(@PathVariable int adId, @PathVariable int commentId) {
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{adId}/comments/{commentId}")
    public ResponseEntity<Comment> updateAdComment(@PathVariable int adId, @PathVariable int commentId, @RequestBody Comment comment) {
        return ResponseEntity.ok(comment);
    }

}
