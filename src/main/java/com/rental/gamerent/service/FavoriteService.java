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

    public List<Favorite> getFavorites(Long userId) {
        return favoriteRepository.findByUserId(userId);
    }

    public Favorite addFavorite(Long userId, Long gameId) {
        Favorite favorite = new Favorite();
        favorite.setUserId(userId);
        favorite.setGameId(gameId);
        return favoriteRepository.save(favorite);
    }

    public void removeFavorite(Long userId, Long gameId) {
        Favorite favorite = favoriteRepository.findByUserIdAndGameId(userId, gameId);
        if (favorite != null) {
            favoriteRepository.delete(favorite);
        }
    }
}
