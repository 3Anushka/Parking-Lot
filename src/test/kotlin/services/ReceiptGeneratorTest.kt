package services

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReceiptGeneratorTest{
    @Test
    fun `it should generate receipt`(){
        val receiptGenerator = ReceiptGenerator()
        val receipt = receiptGenerator.generateReceipt()

        assertEquals(1,receipt.receiptNumber)
        assertEquals("2023-02-17",receipt.entryDateOfVehicle)
    }
}