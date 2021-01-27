package com.selfdev.cardwar.domain.game;

import com.selfdev.cardwar.domain.player.Player;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    //kiedys data
    @ManyToOne(fetch=FetchType.LAZY,
    cascade = CascadeType.ALL)
    private Player playerOne;
    @ManyToOne(fetch=FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Player playerTwo;

    public Game(Player player_one, Player player_two) {
        this.playerOne = player_one;
        this.playerTwo = player_two;
    }
}
