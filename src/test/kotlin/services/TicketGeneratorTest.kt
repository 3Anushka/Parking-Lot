package services

import models.Ticket
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TicketGeneratorTest {
    @Test
    fun `it should generate a ticket`() {
        val ticketGenerate = TicketGenerator()
        val ticket = ticketGenerate.generateTicket(Ticket().slotNumber)

        assertEquals(1, ticket.ticketNumber)
    }
}
