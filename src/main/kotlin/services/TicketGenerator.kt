package services

import models.Ticket
import repo.Repo
import java.time.LocalDateTime

class TicketGenerator {


    val ticket = Ticket()

    fun generateTicket(slotNumber: Int): Ticket {
        ticket.ticketNumber++
        ticket.entryTimeOfVehicle = LocalDateTime.now()
        ticket.slotNumber = slotNumber

        Repo.allTickets[ticket.ticketNumber] = Ticket()

        return ticket
    }
}