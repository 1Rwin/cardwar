package com.selfdev.cardwar.infrastructure.game;

import com.selfdev.cardwar.aplication.game.dto.*;
import com.selfdev.cardwar.aplication.game.facade.GameFacade;
import com.selfdev.cardwar.domain.game.GameParameter;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@AllArgsConstructor
public class GameEndpoint {
    
    private final GameFacade gameFacade;
    
    @PostMapping("/game/create")
    public GameCreateResponse create(@RequestBody GameCreateRequest request) {
        GameParameter gameParameter = request.getGameParameter();
        return gameFacade.createGame(gameParameter);
    }
    
    @GetMapping("/game/findAll")
    public GamesResponse findAll() {
        return gameFacade.findAll();
    }
    
    @PostMapping("/game/{gameId}/join")
    public GameJoinResponse joinGame(@RequestBody GameJoinRequest request,
                                     @PathVariable("gameId") UUID gameId) {
        return gameFacade.joinGame(request, gameId);
    }
}
