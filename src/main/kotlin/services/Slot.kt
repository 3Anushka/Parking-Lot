package services

class Slot(
    private var totalNoOfSlotForCar: Int = 100
) {
    private var available: Int = totalNoOfSlotForCar
    var parkedVehicle: MutableList<Boolean> = MutableList(totalNoOfSlotForCar + 1) { false }


    fun isFull(): Boolean {
        if (available == 0) {
            return true
        }
        return false
    }

    fun bookSlot(): Int {
        for (slotNumber in 1..totalNoOfSlotForCar) {
            if (!parkedVehicle[slotNumber]) {
                parkedVehicle[slotNumber] = true
                available--
                return slotNumber
            }
        }
        return -1
    }


    fun unBookingSlot(slotNumber: Int) {
        parkedVehicle[slotNumber] = false
        available++

    }

}