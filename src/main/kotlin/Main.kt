import models.Receipt
import models.Ticket
import services.ParkingLot

fun main(args: Array<String>) {
    val parkingLot = ParkingLot()
    val ticket = parkingLot.parkVehicle()
    println("Ticket is:\nTicket Number:\t${ticket.ticketNumber}\nEntry Time:\t${ticket.entryTimeOfVehicle}")

    val receipt = parkingLot.unparkVehicle(ticket.ticketNumber)

    println("Receipt is:\nReceipt Number:\t${receipt.receiptNumber}\nEntry Time:\t${ticket.entryTimeOfVehicle}\nExit Time:\t${receipt.exitTimeOfVehicle}\nReceiptFee ${receipt.fee}")


}