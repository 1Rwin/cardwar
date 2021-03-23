package com.selfdev.cardwar.aplication.player.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder
@Getter
public class PlayerCreateResponse {
    UUID playerId;
    String playerName;
}
