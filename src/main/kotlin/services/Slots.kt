package services

import exceptions.SlotFullException

class Slots(
    private var totalNoOfSlotForCar: Int = 100
) {

    private var available: Int = totalNoOfSlotForCar
    val slotNumber: Int = 0
    var parkedVehicle: MutableList<Boolean> = MutableList(totalNoOfSlotForCar + 1) { false }


    fun assignSlotToVehicle()
    {

    }

    fun isFull(): Boolean {
        if (available == 0) {
            return true
        }
        return false
    }

    fun bookSlot(): Int {
        for (slotNumber in 1..totalNoOfSlotForCar)
            if (!parkedVehicle[slotNumber]) {
                parkedVehicle[slotNumber] = true
                available--
                return slotNumber
            }
        throw SlotFullException("Slot is FULL")
    }


        fun freeBookingSlot(slotNumber: Int) {
            parkedVehicle[slotNumber] = false
            available++
        }

}