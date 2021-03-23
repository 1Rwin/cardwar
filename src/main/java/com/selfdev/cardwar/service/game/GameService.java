package com.selfdev.cardwar.service.game;

import com.selfdev.cardwar.domain.game.Game;
import com.selfdev.cardwar.domain.game.GameParameter;
import com.selfdev.cardwar.infrastructure.game.factory.GameFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class GameService {

    private final GameFactory gameFactory;

    public Game createGame(GameParameter gameParameter) {
        return gameFactory.create(gameParameter);
    }
}
