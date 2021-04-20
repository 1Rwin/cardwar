package com.selfdev.cardwar.aplication.game.facade;

import com.selfdev.cardwar.aplication.game.dto.GameCreateResponse;
import com.selfdev.cardwar.aplication.game.dto.GameJoinRequest;
import com.selfdev.cardwar.aplication.game.dto.GameJoinResponse;
import com.selfdev.cardwar.aplication.game.dto.GamesResponse;
import com.selfdev.cardwar.domain.game.GameParameter;

import java.util.UUID;

public interface GameFacade {
    
    GameCreateResponse createGame(GameParameter gameParameter);
    
    GamesResponse findAll();
    
    GameJoinResponse joinGame(GameJoinRequest request, UUID gameId);
}
