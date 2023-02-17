package models

import java.time.LocalDateTime

class Ticket(
    var ticketNumber: Int = 0,
    var entryTimeOfVehicle: LocalDateTime = LocalDateTime.now(),
    var slotNumber: Int = 0
) {

}