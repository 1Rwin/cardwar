package com.selfdev.cardwar.domain.game;

import com.selfdev.cardwar.domain.player.Player;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class GameParameter {

    Integer playersNumber;
    Player hostPlayer;
}
