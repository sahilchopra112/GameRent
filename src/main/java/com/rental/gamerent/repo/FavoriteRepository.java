package com.rental.gamerent.repo;

import com.rental.gamerent.model.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< Updated upstream

import java.util.List;

=======
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
>>>>>>> Stashed changes
public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
    List<Favorite> findByUserId(Long userId);

    Favorite findByUserIdAndGameId(Long userId, Long gameId);
}
