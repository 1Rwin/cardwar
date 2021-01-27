package com.selfdev.cardwar.infrastructure.core;

import com.selfdev.cardwar.domain.card.Card;
import com.selfdev.cardwar.domain.card.Colour;
import com.selfdev.cardwar.domain.game.Game;
import com.selfdev.cardwar.domain.player.Player;
import com.selfdev.cardwar.repository.CardRepository;
import com.selfdev.cardwar.repository.GameRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class DataInitializer {

    private final CardRepository cardRepository;
    private final GameRepository gameRepository;

    @EventListener(ContextRefreshedEvent.class)
    public void setUpGame() {
        initCardDeck();
        initGames();
    }

    private void initGames() {
        cardRepository.deleteAll();
        cardRepository.saveAll(createDeck());
    }

    private void initCardDeck() {
        gameRepository.deleteAll();
        gameRepository.saveAll(creatGame());
    }

    private List<Game> creatGame() {
        List<Game> gameList = new ArrayList<>();
        gameList.add(createGame(createPlayer("Player_One"), createPlayer("Player_Two")));
        return gameList;
    }

    private Game createGame(Player player_one, Player player_two) {
        return new Game(player_one, player_two);
    }

    private Player createPlayer(String name) {
        return new Player(name);
    }


    private List<Card> createDeck() {
        List<Card> cards = new ArrayList<>();

        cards.addAll(createColor(Colour.DZWONKI));
        cards.addAll(createColor(Colour.PIKI));
        cards.addAll(createColor(Colour.SERDUSZKA));
        cards.addAll(createColor(Colour.TREFLE));
        return cards;
    }

    private List<Card> createColor(Colour colour) {
        List<Card> colourCards = new ArrayList<>();
        for (int j = 2; j < 15; j++) {
            colourCards.add(new Card(j, colour));
        }
        return colourCards;
    }
}
