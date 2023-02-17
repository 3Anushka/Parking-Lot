import services.ParkingLot

fun main() {
    val parkingLot = ParkingLot()
    val ticket = parkingLot.parkVehicle()
    println("Ticket is:\nTicket Number:\t${ticket!!.ticketNumber}\nEntry Time:\t${ticket.entryTimeOfVehicle}")

    val receipt = parkingLot.unParkVehicle(ticket!!.ticketNumber)

    println("Receipt is:\nReceipt Number:\t${receipt.receiptNumber}\nEntry Time:\t${ticket.entryTimeOfVehicle}\nExit Time:\t${receipt.exitTimeOfVehicle}\nReceiptFee ${receipt.fee}")


}