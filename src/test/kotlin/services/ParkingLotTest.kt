package services

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ParkingLotTest {
    @Test
    fun `it should generate a ticket after parking a vehicle`() {

        val ticket = ParkingLot().parkVehicle()

        Assertions.assertNotNull(ticket)
        assertEquals(1, ticket!!.ticketNumber)
    }

    @Test
    fun `it should generate a receipt after unparking a vehicle`() {
        val ticket = ParkingLot().parkVehicle()

        Assertions.assertNotNull(ticket)
        val receipt = ParkingLot().unParkVehicle(ticket!!.ticketNumber)
        assertEquals(1, receipt.receiptNumber)
    }
}