package com.selfdev.cardwar.infrastructure.game.facade;

import com.selfdev.cardwar.aplication.game.dto.GameCreateResponse;
import com.selfdev.cardwar.aplication.game.facade.GameFacade;
import com.selfdev.cardwar.domain.game.Game;
import com.selfdev.cardwar.domain.game.GameParameter;
import com.selfdev.cardwar.infrastructure.game.mapper.GameCreateMapper;
import com.selfdev.cardwar.service.game.GameService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class GameFacadeImpl implements GameFacade {

    private final GameService service;
    private final GameCreateMapper mapper;

    @Override
    public GameCreateResponse createGame(GameParameter gameParameter) {
        Game game = service.createGame(gameParameter);
        return mapper.mapToGameCreateResponse(game);
    }
}
