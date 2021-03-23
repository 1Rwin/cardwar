package com.selfdev.cardwar.infrastructure.test

import com.fasterxml.jackson.databind.ObjectMapper
import com.selfdev.cardwar.CardWarApplication
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

@CompileStatic
@SpringBootTest
@ContextConfiguration(classes = [CardWarApplication])
@AutoConfigureMockMvc
class BaseIntegrationSpec extends Specification {

    @Autowired
    protected MockMvc mockMvc

    @Autowired
    protected ObjectMapper objectMapper
}
