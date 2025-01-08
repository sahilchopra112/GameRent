package com.rental.gamerent.repo;

import com.rental.gamerent.model.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
    List<Favorite> findByUserId(Long userId);

    Favorite findByUserIdAndGameId(Long userId, Long gameId);
}
