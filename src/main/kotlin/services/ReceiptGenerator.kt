package services

import models.Receipt
import models.Ticket
import java.time.LocalDateTime

class ReceiptGenerator {


    private val feeCalculator = FeeCalculator()
    fun generateReceipt(ticket: Ticket): Receipt {
        val receipt = Receipt()
        receipt.receiptNumber++
        ticket.entryTimeOfVehicle = LocalDateTime.now()
        val fee = feeCalculator.calculateFee(receipt.exitTimeOfVehicle, ticket.entryTimeOfVehicle)
        receipt.fee = fee
        return receipt
    }
}