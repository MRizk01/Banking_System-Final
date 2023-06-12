package UNIT;
import Classes.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class TransactionTest {

    @Test
    public void testGetID() {
        Transaction transaction = new Transaction("1", "deposit", 100.0);
        String expectedID = "1";
        String actualID = transaction.getID();
        assertEquals(expectedID, actualID);
    }

    @Test
    public void testGetRecipientID() {
        Transaction transaction = new Transaction("1", "2", "transfer", 100.0);
        String expectedRecipientID = "2";
        String actualRecipientID = transaction.getRecipientID();
        assertEquals(expectedRecipientID, actualRecipientID);
    }

    @Test
    public void testGetType() {
        Transaction transaction = new Transaction("1", "deposit", 100.0);
        String expectedType = "deposit";
        String actualType = transaction.getType();
        assertEquals(expectedType, actualType);
    }

    @Test
    public void testGetAmount() {
        Transaction transaction = new Transaction("1", "deposit", 100.0);
        double expectedAmount = 100.0;
        double actualAmount = transaction.getAmount();
        assertEquals(expectedAmount, actualAmount, 0.0);
    }
    @Test
    public void testGetTransactionDate() {
        Transaction transaction = new Transaction("1", "deposit", 100.0);
        assertEquals("2023-06-10", transaction.getTransactionDate());
    }


    @Test
    public void testIsDeposit() {
        Transaction depositTransaction = new Transaction("1", "deposit", 100.0);
        Transaction withdrawalTransaction = new Transaction("2", "withdrawal", 50.0);
        assertTrue(depositTransaction.isDeposit());
        assertFalse(withdrawalTransaction.isDeposit());
    }

    @Test
    public void testIsTransfer() {
        Transaction transferTransaction = new Transaction("1", "5678", "transfer", 50.0);
        Transaction withdrawalTransaction = new Transaction("2", "withdrawal", 50.0);
        assertTrue(transferTransaction.isTransfer());
        assertFalse(withdrawalTransaction.isTransfer());
    }











}
