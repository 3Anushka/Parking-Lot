package repo

import models.Ticket

class Repo {

    companion object {
        val allTickets = mutableMapOf<Int, Ticket>()

        fun getTicketWithNo(ticketNo: Int): Ticket {

            return allTickets.getValue(ticketNo)

        }
    }

}