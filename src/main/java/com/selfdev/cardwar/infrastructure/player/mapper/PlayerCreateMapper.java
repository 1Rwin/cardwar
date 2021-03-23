package com.selfdev.cardwar.infrastructure.player.mapper;

import com.selfdev.cardwar.aplication.player.dto.PlayerCreateResponse;
import com.selfdev.cardwar.domain.player.Player;
import org.springframework.stereotype.Component;

@Component
public class PlayerCreateMapper {

    public PlayerCreateResponse mapToPlayerCreateResponse(Player player) {
        return PlayerCreateResponse.builder()
                .playerId(player.getId())
                .playerName(player.getName())
                .build();
    }
}
