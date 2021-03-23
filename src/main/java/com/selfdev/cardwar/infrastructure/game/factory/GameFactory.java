package com.selfdev.cardwar.infrastructure.game.factory;

import com.selfdev.cardwar.domain.game.Game;
import com.selfdev.cardwar.domain.game.GameParameter;
import com.selfdev.cardwar.domain.player.Player;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class GameFactory {

    public Game create(GameParameter gameParameter) {
        return Game.builder()
                .id(UUID.randomUUID())
                .hostPlayer(createPlayer(gameParameter))
                .build();
    }

    private Player createPlayer(GameParameter gameParameter) {
        return new Player(gameParameter.getHostPlayerName());
    }
}
