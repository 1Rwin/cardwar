package com.selfdev.cardwar.repository.game;

import com.selfdev.cardwar.domain.game.Game;
import com.selfdev.cardwar.domain.game.GameStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface GameRepository extends JpaRepository<Game, UUID> {
    List<Game> findByStatus(GameStatus open);
}
