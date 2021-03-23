package com.selfdev.cardwar.infrastructure.game.mapper;

import com.selfdev.cardwar.aplication.game.dto.GameCreateResponse;
import com.selfdev.cardwar.domain.game.Game;
import org.springframework.stereotype.Component;

@Component
public class GameCreateMapper {

    public GameCreateResponse mapToGameCreateResponse(Game game) {
        return GameCreateResponse.builder()
                .gameId(game.getId())
                .hostPlayer(game.getHostPlayer())
                .secondPlayer(game.getSecondPlayer())
                .build();
    }
}
