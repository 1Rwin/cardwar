package com.selfdev.cardwar.infrastructure.player.factory;

import com.selfdev.cardwar.domain.player.Player;
import com.selfdev.cardwar.domain.player.PlayerParameter;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class PlayerFactory {

    public Player create(PlayerParameter parameter) {
        return Player.builder()
                .id(UUID.randomUUID())
                .name(parameter.getPlayerName())
                .build();
    }
}
