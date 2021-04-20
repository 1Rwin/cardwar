package com.selfdev.cardwar.infrastructure.game.mapper;

import com.selfdev.cardwar.aplication.game.dto.GameCreateResponse;
import com.selfdev.cardwar.aplication.game.dto.GameJoinResponse;
import com.selfdev.cardwar.aplication.game.dto.GameResponse;
import com.selfdev.cardwar.aplication.game.dto.GamesResponse;
import com.selfdev.cardwar.domain.game.Game;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class GameMapper {
    
    public GameCreateResponse mapToGameCreateResponse(Game game) {
        return GameCreateResponse.builder()
                .gameId(game.getId())
                .hostPlayer(game.getHostPlayer())
                .secondPlayer(game.getSecondPlayer())
                .status(game.getStatus())
                .build();
    }
    
    public GamesResponse mapToGamesResponse(List<Game> games) {
        List<GameResponse> gamesList = new ArrayList<>();
        for (Game game : games) {
            UUID gameId = game.getId();
            String hostName = game.getHostPlayer().getName();
            GameResponse gameResponse = new GameResponse(gameId, hostName);
            gamesList.add(gameResponse);
        }
        return new GamesResponse(gamesList);
    }
    
    public GameJoinResponse mapToGameJoinResponse(Game game) {
        return GameJoinResponse.builder()
                .gameId(game.getId())
                .hostPlayer(game.getHostPlayer())
                .secondPlayer(game.getSecondPlayer())
                .status(game.getStatus())
                .build();
    }
}
