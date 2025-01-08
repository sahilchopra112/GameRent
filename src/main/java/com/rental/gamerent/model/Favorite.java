package com.rental.gamerent.model;

import jakarta.persistence.*;
<<<<<<< Updated upstream
import java.time.LocalDateTime;

@Entity
=======
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "favorite")
>>>>>>> Stashed changes
public class Favorite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

<<<<<<< Updated upstream
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

   
=======
    @Column(name = "game_id")
    private Long gameId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "title")
    private String title;

    @Column(name = "genre")
    private String genre;

    @Column(name = "platform")
    private String platform;

    @Column(name = "price_per_day")
    private Double pricePerDay;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "availability")
    private Boolean availability;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "requirement_memory")
    private String requirementMemory;

    @Column(name = "requirement_processor")
    private String requirementProcessor;

    @Column(name = "requirement_graphics")
    private String requirementGraphics;

    @Column(name = "requirement_storage")
    private String requirementStorage;

    @Column(name = "favorited_at")
    private LocalDateTime favoritedAt;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequirementMemory() {
        return requirementMemory;
    }

    public void setRequirementMemory(String requirementMemory) {
        this.requirementMemory = requirementMemory;
    }

    public String getRequirementProcessor() {
        return requirementProcessor;
    }

    public void setRequirementProcessor(String requirementProcessor) {
        this.requirementProcessor = requirementProcessor;
    }

    public String getRequirementGraphics() {
        return requirementGraphics;
    }

    public void setRequirementGraphics(String requirementGraphics) {
        this.requirementGraphics = requirementGraphics;
    }

    public String getRequirementStorage() {
        return requirementStorage;
    }

    public void setRequirementStorage(String requirementStorage) {
        this.requirementStorage = requirementStorage;
    }

    public LocalDateTime getFavoritedAt() {
        return favoritedAt;
    }

    public void setFavoritedAt(LocalDateTime favoritedAt) {
        this.favoritedAt = favoritedAt;
    }
}
>>>>>>> Stashed changes
