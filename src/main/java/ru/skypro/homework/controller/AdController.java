package ru.skypro.homework.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.skypro.homework.dto.Ad;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ads")
@RequiredArgsConstructor
@Tag(name = "Объявления")
public class AdController {

    @Operation(summary = "Получение всех объявлений")
    @GetMapping
    public ResponseEntity<List<Ad>> getAds() {
        return ResponseEntity.ok().body(new ArrayList<Ad>());
    }

    @Operation(summary = "Добавление объявления")
    @PostMapping
    public ResponseEntity<Ad> createAd(@RequestBody Ad ad) {
        return ResponseEntity.ok().body(ad);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ad> getAdById(@PathVariable int id) {
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAd(@PathVariable int id) {
        return ResponseEntity.ok().body(null);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Ad> updateAd(@PathVariable int id, @RequestBody Ad ad) {
        return ResponseEntity.ok().body(null);
    }

    @GetMapping("/me")
    public ResponseEntity<Ad> getCurrentUserAds() {
        return ResponseEntity.ok().body(null);
    }

    @PatchMapping("/{id}/image")
    public ResponseEntity<Ad> updateAdImage(@PathVariable int id, @RequestBody Ad ad) {
        return ResponseEntity.ok().body(null);
    }

}
