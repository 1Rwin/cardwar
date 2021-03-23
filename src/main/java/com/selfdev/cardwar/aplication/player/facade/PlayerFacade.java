package com.selfdev.cardwar.aplication.player.facade;

import com.selfdev.cardwar.aplication.player.dto.PlayerCreateResponse;
import com.selfdev.cardwar.domain.player.PlayerParameter;

public interface PlayerFacade {

    PlayerCreateResponse create(PlayerParameter parameter);
}
