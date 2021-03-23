package com.selfdev.cardwar.infrastructure.player;

import com.selfdev.cardwar.aplication.player.dto.PlayerCreateRequest;
import com.selfdev.cardwar.aplication.player.dto.PlayerCreateResponse;
import com.selfdev.cardwar.aplication.player.facade.PlayerFacade;
import com.selfdev.cardwar.domain.player.PlayerParameter;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PlayerEndpoint {

    private final PlayerFacade playerFacade;

    @PostMapping("/player/create")
    public PlayerCreateResponse create(@RequestBody PlayerCreateRequest request) {
        PlayerParameter playerParameter = request.getPlayerParameter();
        return playerFacade.create(playerParameter);
    }
}
