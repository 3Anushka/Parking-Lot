package services

import models.Ticket

class TicketGenerator() {
    var ticket:Ticket=Ticket()
    fun generateTicket(slotNumber: Int): Ticket{
        ticket.ticketNumber++
        return ticket
    }
}