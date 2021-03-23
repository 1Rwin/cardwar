package com.selfdev.cardwar.aplication.player.dto;

import com.selfdev.cardwar.domain.player.PlayerParameter;
import lombok.Data;

@Data
public class PlayerCreateRequest {

    private PlayerParameter playerParameter;
}
