package com.selfdev.cardwar.aplication.game.dto;

import com.selfdev.cardwar.domain.game.GameStatus;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder
@Getter
public class GameJoinResponse {
    UUID gameId;
    String hostPlayer;
    String secondPlayer;
    GameStatus status;
}
