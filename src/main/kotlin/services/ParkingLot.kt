package services

import models.Receipt
import models.Ticket
import repo.Repo

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

    fun unparkVehicle(ticketNo:Int): Receipt {

        val ticket= Repo.getTicketWithNo(ticketNo)
        val vehicleReceipt = receiptGenerator.generateReceipt(ticket)

        slot.unBookingSlot(vehicleReceipt.slotNumber)
        return vehicleReceipt
    }
}