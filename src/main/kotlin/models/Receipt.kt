package models

import java.time.LocalDateTime


class Receipt(
    var receiptNumber: Int = 0,
    var slotNumber: Int = 0,
    var exitTimeOfVehicle: LocalDateTime = LocalDateTime.now(),
    var fee: Long = 0
)

