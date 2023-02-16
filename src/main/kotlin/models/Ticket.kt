package models

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Ticket(
    var ticketNumber:Int = 0,
    val entryTimeOfVehicle: String = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm")),
    val entryDateOfVehicle: String = LocalDate.now().toString(),
    val slotNumber: Int = 0
)