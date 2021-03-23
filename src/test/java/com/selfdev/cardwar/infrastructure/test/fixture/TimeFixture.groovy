package com.selfdev.cardwar.infrastructure.test.fixture

import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZonedDateTime

class TimeFixture {

    static final ZonedDateTime NOW = ZonedDateTime.of(
            LocalDateTime.now(),
            ZoneId.of("UTC")
    )
}
