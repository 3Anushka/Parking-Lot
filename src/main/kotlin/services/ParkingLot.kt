package services

import models.Receipt
import models.Ticket
import repo.Repo

class ParkingLot {
    private val ticketGenerator = TicketGenerator()
    private val receiptGenerator = ReceiptGenerator()
    private val slot = Slot()

    fun parkVehicle(): Ticket? {

        if (slot.isFull())
            return null

        val slotNumber = slot.bookSlot()
        return ticketGenerator.generateTicket(slotNumber)

    }

    fun unParkVehicle(ticketNo: Int): Receipt {

        val ticket = Repo.getTicketWithNo(ticketNo)
        val vehicleReceipt = receiptGenerator.generateReceipt(ticket)

        slot.unBookingSlot(vehicleReceipt.slotNumber)
        return vehicleReceipt
    }
}