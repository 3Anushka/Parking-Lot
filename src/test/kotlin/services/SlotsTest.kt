package services

import exceptions.SlotFullException
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SlotsTest{
    @Test
    fun `it should book a slot`(){
        var slots = Slots(100)
        slots.bookSlot()
        slots.bookSlot()
        assertTrue(slots.parkedVehicle[1])
        assertTrue(slots.parkedVehicle[2])
        assertFalse(slots.parkedVehicle[6])
    }

    @Test
    fun `Check whether error message is thrown`() {


        val slots= Slots(0)
        assertThrows(SlotFullException::class.java){
            slots.bookSlot()
        }


    }
}