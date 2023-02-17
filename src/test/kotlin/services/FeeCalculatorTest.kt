package services

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.time.LocalDateTime

class FeeCalculatorTest {
    @Test
    fun `it should generate fee`() {
        val localDateTime = LocalDateTime.now()
        val fee = FeeCalculator().calculateFee(localDateTime.plusHours(2), localDateTime)

        assertEquals(20, fee)
    }
}