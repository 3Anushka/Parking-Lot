package services

import models.Receipt
import models.Ticket

class ParkingLot {
    private val ticketGenerator = TicketGenerator()
    private val receiptGenerator = ReceiptGenerator()
    private val receipt = Receipt()
    private var ticket = Ticket()
    private val slot = Slot()


    fun parkVehicle(): Ticket {
        if (!slot.isFull()) {
            val slotNumber = slot.bookSlot()
            ticket = ticketGenerator.generateTicket(slotNumber)
        }
        return ticket
    }

    fun unparkVehicle(): Receipt {
        val vehicleReceipt = receiptGenerator.generateReceipt()
        slot.unBookingSlot(receipt.slotNumber)
        return vehicleReceipt
    }
}