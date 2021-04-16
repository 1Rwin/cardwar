package com.selfdev.cardwar.infrastructure.game.factory;

import com.selfdev.cardwar.domain.game.Game;
import com.selfdev.cardwar.domain.game.GameParameter;
import com.selfdev.cardwar.domain.player.Player;
import org.springframework.stereotype.Component;

import static com.selfdev.cardwar.domain.game.GameStatus.OPEN;

@Component
public class GameFactory {
    
    public Game create(GameParameter gameParameter) {
        return Game.builder()
                .hostPlayer(createPlayer(gameParameter))
                .status(OPEN)
                .build();
    }
    
    private Player createPlayer(GameParameter gameParameter) {
        return new Player(gameParameter.getHostPlayerName());
    }
}
