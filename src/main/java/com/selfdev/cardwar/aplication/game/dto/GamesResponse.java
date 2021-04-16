package com.selfdev.cardwar.aplication.game.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class GamesResponse {
    
    List<GameResponse> gamesList;
}
