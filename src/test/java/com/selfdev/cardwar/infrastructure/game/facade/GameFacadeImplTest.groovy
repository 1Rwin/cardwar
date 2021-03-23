package com.selfdev.cardwar.infrastructure.game.facade

import com.selfdev.cardwar.aplication.game.dto.GameCreateResponse
import com.selfdev.cardwar.aplication.game.facade.GameFacade
import com.selfdev.cardwar.domain.game.GameParameter
import com.selfdev.cardwar.domain.player.Player
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification
import spock.lang.Subject

class GameFacadeImplTest extends Specification {

    @Subject
    @Autowired
    private GameFacade facade

    def "should createGame"() {
        given:
        GameParameter gameParameter = createExampleGameParameter()
        when:
        GameCreateResponse result = facade.createGame(gameParameter)
        then:
        result.gameId != null
    }

    static GameParameter createExampleGameParameter() {
        GameParameter.builder()
                .hostPlayer(new Player("Maciuś"))
                .playersNumber(2)
                .build()
    }


}
