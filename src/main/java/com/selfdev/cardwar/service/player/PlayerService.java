package com.selfdev.cardwar.service.player;

import com.selfdev.cardwar.domain.player.Player;
import com.selfdev.cardwar.domain.player.PlayerParameter;
import com.selfdev.cardwar.infrastructure.player.factory.PlayerFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PlayerService {

    private final PlayerFactory playerFactory;

    public Player createPlayer(PlayerParameter parameter) {
        return playerFactory.create(parameter);
    }
}
