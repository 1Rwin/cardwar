package com.selfdev.cardwar.aplication.game.facade;

import com.selfdev.cardwar.aplication.game.dto.GameCreateResponse;
import com.selfdev.cardwar.domain.game.GameParameter;
import org.springframework.stereotype.Component;

public interface GameFacade {

    GameCreateResponse createGame(GameParameter gameParameter);
}
