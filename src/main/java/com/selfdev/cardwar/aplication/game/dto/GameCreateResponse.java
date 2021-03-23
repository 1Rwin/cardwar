package com.selfdev.cardwar.aplication.game.dto;

import com.selfdev.cardwar.domain.player.Player;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder
@Getter
public class GameCreateResponse {
    UUID gameId;
    Player hostPlayer;
    Player secondPlayer;
}
