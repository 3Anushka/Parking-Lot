package services

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SlotTest {
    @Test
    fun `it should check a slot availability`() {
        val slot = Slot(100)
        assertFalse(slot.isFull())
    }

    @Test
    fun `it should book a slot for car parking`() {
        val slot = Slot(100)
        val firstSlot = slot.bookSlot()
        val secondSlot = slot.bookSlot()

        assertEquals(1, firstSlot)
        assertEquals(2, secondSlot)

    }

    @Test
    fun `it should unparked a car from parking slot`() {
        val slot = Slot(100)

        val firstSlot = slot.bookSlot()
        val secondSlot = slot.bookSlot()

        slot.unBookingSlot(1)

        assertFalse(slot.parkedVehicle[firstSlot])
        assertTrue(slot.parkedVehicle[secondSlot])

    }
}