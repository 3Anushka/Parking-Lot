package services

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ParkingLotTest {
    @Test
    fun `it should generate a ticket after parking a vehicle`() {

        val ticket = ParkingLot().parkVehicle()

        assertEquals(1, ticket.ticketNumber)
        assertEquals("2023-02-17", ticket.entryDateOfVehicle)
    }

    @Test
    fun `it should generate a receipt after unparking a vehicle`(){
        val receipt = ParkingLot().unparkVehicle()

        assertEquals(1,receipt.receiptNumber)
        assertEquals("2023-02-17",receipt.exitDateOfVehicle)
    }
}