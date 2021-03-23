package com.selfdev.cardwar.domain.game;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class GameParameter {

    Integer playersNumber;
    String hostPlayerName;
}
