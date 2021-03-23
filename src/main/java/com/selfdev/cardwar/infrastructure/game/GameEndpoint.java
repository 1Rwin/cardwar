package com.selfdev.cardwar.infrastructure.game;

import com.selfdev.cardwar.aplication.game.dto.GameCreateRequest;
import com.selfdev.cardwar.aplication.game.dto.GameCreateResponse;
import com.selfdev.cardwar.aplication.game.facade.GameFacade;
import com.selfdev.cardwar.domain.game.GameParameter;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class GameEndpoint {

    private final GameFacade gameFacade;

    @PostMapping("/game/create")
    public GameCreateResponse create(@RequestBody GameCreateRequest request) {
        GameParameter gameParameter = request.getGameParameter();
        return gameFacade.createGame(gameParameter);
    }
}