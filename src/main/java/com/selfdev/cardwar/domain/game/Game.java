package com.selfdev.cardwar.domain.game;

import com.selfdev.cardwar.domain.player.Player;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
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
    
    private LocalDateTime dateTime;
    
    @ManyToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Player hostPlayer;
    
    @ManyToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Player secondPlayer;
    
    @Enumerated(EnumType.ORDINAL)
    private GameStatus status;
    
    public Game(Player playerOne, Player playerTwo) {
        this.hostPlayer = playerOne;
        this.secondPlayer = playerTwo;
    }
    
    @PrePersist
    private void setCreationDateTime() {
        this.dateTime = LocalDateTime.now();
    }
}
