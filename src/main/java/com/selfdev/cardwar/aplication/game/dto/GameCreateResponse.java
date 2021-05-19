package com.selfdev.cardwar.aplication.game.dto;

import com.selfdev.cardwar.domain.game.GameStatus;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Getter
public class GameCreateResponse {
    UUID gameId;
    String hostPlayer;
    String secondPlayer;
    GameStatus status;
    LocalDateTime creationGameDate;
}
