package services

import models.Receipt
import models.Ticket
import java.time.Duration
import java.time.LocalDateTime

class FeeCalculator {
    fun calculateFee(exitTime:LocalDateTime,entryTime: LocalDateTime) : Long{
        val fee = Duration.between(entryTime,exitTime).toHours()*10
        return fee
    }
}