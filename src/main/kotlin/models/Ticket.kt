package models

import java.time.LocalDate
import java.time.LocalDateTime

class Ticket(var ticketNumber: Int = 0,
             var entryTimeOfVehicle: LocalDateTime = LocalDateTime.now(),
             val entryDateOfVehicle: LocalDate = LocalDate.now(),
             val slotNumber: Int = 0
) {

}