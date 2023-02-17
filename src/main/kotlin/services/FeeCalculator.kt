package services

import java.time.Duration
import java.time.LocalDateTime
import kotlin.math.ceil

class FeeCalculator {
    fun calculateFee(exitTime: LocalDateTime, entryTime: LocalDateTime): Long {
        return ceil(Duration.between(entryTime, exitTime).toMinutes() / 60.0).toLong() * 10
    }
}