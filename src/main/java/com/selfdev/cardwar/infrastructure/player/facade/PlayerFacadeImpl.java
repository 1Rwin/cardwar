package com.selfdev.cardwar.infrastructure.player.facade;

import com.selfdev.cardwar.aplication.player.dto.PlayerCreateResponse;
import com.selfdev.cardwar.aplication.player.facade.PlayerFacade;
import com.selfdev.cardwar.domain.player.Player;
import com.selfdev.cardwar.domain.player.PlayerParameter;
import com.selfdev.cardwar.infrastructure.player.mapper.PlayerCreateMapper;
import com.selfdev.cardwar.service.player.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PlayerFacadeImpl implements PlayerFacade {

    private final PlayerService service;
    private final PlayerCreateMapper mapper;


    @Override
    public PlayerCreateResponse create(PlayerParameter parameter) {
        Player player = service.createPlayer(parameter);
        return mapper.mapToPlayerCreateResponse(player);
    }
}
