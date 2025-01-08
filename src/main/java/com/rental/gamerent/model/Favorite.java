package com.rental.gamerent.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Favorite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private Long gameId;

    private LocalDateTime favoritedAt;
 // Getters and Setters
 public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public Long getUserId() {
    return userId;
}

public void setUserId(Long userId) {
    this.userId = userId;
}

public Long getGameId() {
    return gameId;
}

public void setGameId(Long gameId) {
    this.gameId = gameId;
}

public LocalDateTime getFavoritedAt() {
    return favoritedAt;
}

public void setFavoritedAt(LocalDateTime favoritedAt) {
    this.favoritedAt = favoritedAt;
}
}

   
