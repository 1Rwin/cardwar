package com.selfdev.cardwar.infrastructure.game.facade;

import com.selfdev.cardwar.aplication.game.dto.GameCreateResponse;
import com.selfdev.cardwar.aplication.game.dto.GamesResponse;
import com.selfdev.cardwar.aplication.game.facade.GameFacade;
import com.selfdev.cardwar.domain.game.Game;
import com.selfdev.cardwar.domain.game.GameParameter;
import com.selfdev.cardwar.infrastructure.game.mapper.GameCreateMapper;
import com.selfdev.cardwar.repository.game.GameRepository;
import com.selfdev.cardwar.service.game.GameService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.selfdev.cardwar.domain.game.GameStatus.OPEN;

@Component
@AllArgsConstructor
public class GameFacadeImpl implements GameFacade {
    
    private final GameService service;
    private final GameCreateMapper mapper;
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
}
