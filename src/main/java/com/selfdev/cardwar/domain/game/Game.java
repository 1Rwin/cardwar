package com.selfdev.cardwar.domain.game;

import com.selfdev.cardwar.domain.player.Player;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    //kiedys data
    @ManyToOne(fetch=FetchType.LAZY,
    cascade = CascadeType.ALL)
    private Player hostPlayer;
    @ManyToOne(fetch=FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Player secondPlayer;

    public Game(Player player_one, Player player_two) {
        this.hostPlayer = player_one;
        this.secondPlayer = player_two;
    }
}
