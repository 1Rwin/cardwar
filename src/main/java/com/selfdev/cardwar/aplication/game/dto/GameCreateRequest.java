package com.selfdev.cardwar.aplication.game.dto;

import com.selfdev.cardwar.domain.game.GameParameter;
import lombok.Data;

@Data
public class GameCreateRequest {

    private GameParameter gameParameter;
}
