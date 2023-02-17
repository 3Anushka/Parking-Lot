package services

import models.Receipt
import models.Ticket
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.time.LocalDateTime

class FeeCalculatorTest{
    @Test
    fun `it should generate fee`(){
       val fee = FeeCalculator().calculateFee(LocalDateTime.now().plusHours(2), LocalDateTime.now())

        assertEquals(10,fee)
    }
}