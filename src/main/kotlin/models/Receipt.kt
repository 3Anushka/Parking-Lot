package models

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Receipt(
    var receiptNumber: Int = 0,
    var slotNumber: Int = 0,
    var entryTimeOfVehicle: String = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm")),
    var exitTimeOfVehicle: String = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm")),
    var entryDateOfVehicle: String = LocalDate.now().toString(),
    var exitDateOfVehicle: String = LocalDate.now().toString(),
) {
}