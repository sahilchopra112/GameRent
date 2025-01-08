package com.rental.gamerent.controller;

import com.rental.gamerent.model.Favorite;
import com.rental.gamerent.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favorites")
public class FavoriteController {

    @Autowired
    private FavoriteService favoriteService;

    // Get all favorites for a user
    @GetMapping
    public ResponseEntity<List<Favorite>> getFavorites(@RequestParam("userId") Long userId) {
        List<Favorite> favorites = favoriteService.getFavorites(userId);
        return ResponseEntity.ok(favorites);
    }

    // Add a favorite for a user
    @PostMapping
    public ResponseEntity<Favorite> addFavorite(@RequestParam("userId") Long userId, @RequestParam("gameId") Long gameId) {
        Favorite favorite = favoriteService.addFavorite(userId, gameId);
        return ResponseEntity.ok(favorite);
    }

    // Remove a favorite for a user
    @DeleteMapping
    public ResponseEntity<Void> removeFavorite(@RequestParam("userId") Long userId, @RequestParam("gameId") Long gameId) {
        favoriteService.removeFavorite(userId, gameId);
        return ResponseEntity.ok().build();
    }
}
