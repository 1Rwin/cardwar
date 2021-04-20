package com.selfdev.cardwar.infrastructure.game.facade;

import com.selfdev.cardwar.aplication.game.dto.GameCreateResponse;
import com.selfdev.cardwar.aplication.game.dto.GameJoinRequest;
import com.selfdev.cardwar.aplication.game.dto.GameJoinResponse;
import com.selfdev.cardwar.aplication.game.dto.GamesResponse;
import com.selfdev.cardwar.aplication.game.facade.GameFacade;
import com.selfdev.cardwar.domain.game.Game;
import com.selfdev.cardwar.domain.game.GameParameter;
import com.selfdev.cardwar.domain.player.Player;
import com.selfdev.cardwar.infrastructure.game.mapper.GameMapper;
import com.selfdev.cardwar.repository.game.GameRepository;
import com.selfdev.cardwar.service.game.GameService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.selfdev.cardwar.domain.game.GameStatus.OPEN;
import static com.selfdev.cardwar.domain.game.GameStatus.READY_TO_PLAY;

@Component
@AllArgsConstructor
public class GameFacadeImpl implements GameFacade {
    
    private final GameService service;
    private final GameMapper mapper;
    private final GameRepository repository;
    
    @Override
    public GameCreateResponse createGame(GameParameter gameParameter) {
        Game game = service.createGame(gameParameter);
        repository.save(game);
        return mapper.mapToGameCreateResponse(game);
    }
    
    @Override
    public GamesResponse findAll() {
        List<Game> games = repository.findByStatus(OPEN);
        return mapper.mapToGamesResponse(games);
    }
    
    @Override
    public GameJoinResponse joinGame(GameJoinRequest request, UUID gameId) {
        Player secondPlayer = new Player(request.getSecondPlayerName());
        Game game = getGame(gameId);
        game.setSecondPlayer(secondPlayer);
        game.setStatus(READY_TO_PLAY);
        repository.save(game);
        return mapper.mapToGameJoinResponse(game);
    }
    
    private Game getGame(UUID gameId) {
        Optional<Game> game = repository.findById(gameId);
        if (game.isPresent()) {
            return game.get();
        } else {
            throw new IllegalArgumentException("Game is null");
        }
    }
}
