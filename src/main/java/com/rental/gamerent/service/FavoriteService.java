package com.rental.gamerent.service;

import com.rental.gamerent.model.Favorite;
import com.rental.gamerent.repo.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteService {

    @Autowired
    private FavoriteRepository favoriteRepository;

<<<<<<< Updated upstream
    public List<Favorite> getFavorites(Long userId) {
=======
    public List<Favorite> getFavoritesByUserId(Long userId) {
>>>>>>> Stashed changes
        return favoriteRepository.findByUserId(userId);
    }

    public Favorite addFavorite(Long userId, Long gameId) {
        Favorite favorite = new Favorite();
        favorite.setUserId(userId);
        favorite.setGameId(gameId);
<<<<<<< Updated upstream
=======
        favorite.setFavoritedAt(java.time.LocalDateTime.now());
>>>>>>> Stashed changes
        return favoriteRepository.save(favorite);
    }

    public void removeFavorite(Long userId, Long gameId) {
        Favorite favorite = favoriteRepository.findByUserIdAndGameId(userId, gameId);
        if (favorite != null) {
            favoriteRepository.delete(favorite);
        }
    }
}
