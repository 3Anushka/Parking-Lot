package services

import models.Receipt
import models.Ticket

class ReceiptGenerator {
    val receipt = Receipt()
    val ticket = Ticket()
    fun generateReceipt():Receipt{
        var receiptNumber = receipt.receiptNumber++
        var entryTimeOfVehicle = ticket.entryTimeOfVehicle
        var entryDateOfVehicle = ticket.entryDateOfVehicle
        return receipt
    }
}