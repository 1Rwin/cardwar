package com.selfdev.cardwar.aplication.game.dto;

import com.selfdev.cardwar.domain.game.GameStatus;
import com.selfdev.cardwar.domain.player.Player;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder
@Getter
public class GameJoinResponse {
    UUID gameId;
    Player hostPlayer;
    Player secondPlayer;
    GameStatus status;
}
