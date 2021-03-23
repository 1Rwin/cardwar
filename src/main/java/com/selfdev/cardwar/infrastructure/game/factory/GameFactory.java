package com.selfdev.cardwar.infrastructure.game.factory;

import com.selfdev.cardwar.domain.game.Game;
import com.selfdev.cardwar.domain.game.GameParameter;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class GameFactory {

    public Game create(GameParameter gameParameter) {
        return Game.builder()
                .id(UUID.randomUUID())
                .hostPlayer(gameParameter.getHostPlayer())
                .build();
    }
}
