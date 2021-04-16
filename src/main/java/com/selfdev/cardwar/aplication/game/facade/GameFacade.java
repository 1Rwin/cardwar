package com.selfdev.cardwar.aplication.game.facade;

import com.selfdev.cardwar.aplication.game.dto.GameCreateResponse;
import com.selfdev.cardwar.aplication.game.dto.GamesResponse;
import com.selfdev.cardwar.domain.game.GameParameter;

public interface GameFacade {
    
    GameCreateResponse createGame(GameParameter gameParameter);
    
    GamesResponse findAll();
}
