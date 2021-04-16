package com.selfdev.cardwar.aplication.game.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class GameResponse {
    
    UUID gameId;
    String hostName;
    
}
