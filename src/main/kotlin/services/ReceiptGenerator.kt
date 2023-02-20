package services

import models.Receipt
import models.Ticket


class ReceiptGenerator {


    private val feeCalculator = FeeCalculator()
    fun generateReceipt(ticket: Ticket): Receipt {
        val receipt = Receipt()
        receipt.receiptNumber++
        val fee = feeCalculator.calculateFee(receipt.exitTimeOfVehicle, ticket.entryTimeOfVehicle)
        receipt.fee = fee
        return receipt
    }
}