package services

import models.Receipt
import models.Ticket
import repo.Repo
import java.time.LocalDateTime

class TicketGenerator() {
    fun generateTicket(slotNumber: Int): Ticket{
        var ticket:Ticket=Ticket()

        ticket.ticketNumber++
        ticket.entryTimeOfVehicle = LocalDateTime.now()

        Repo.allTickets.put(ticket.ticketNumber,Ticket())


        return ticket
    }
}