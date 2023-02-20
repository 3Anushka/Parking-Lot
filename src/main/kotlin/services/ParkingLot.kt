package services

import exceptions.SlotFullException
import models.Receipt
import models.Ticket
import repo.Repo

class ParkingLot {
    private val ticketGenerator = TicketGenerator()
    private val receiptGenerator = ReceiptGenerator()
    private val slot = Slots()

    fun parkVehicle(): Ticket {

        if (slot.isFull()) {
            throw SlotFullException("Slot is Full cannot park Vehicle")
        }
        val slotNumber = slot.bookSlot()

        return ticketGenerator.generateTicket(slotNumber)

    }

    fun unParkVehicle(ticketNo: Int): Receipt {

        val ticket = Repo.getTicketWithNo(ticketNo)
        val vehicleReceipt = receiptGenerator.generateReceipt(ticket)

        slot.freeBookingSlot(vehicleReceipt.slotNumber)
        return vehicleReceipt
    }
}