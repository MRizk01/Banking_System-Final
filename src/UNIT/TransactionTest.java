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
        Transaction transaction = new Transaction(1, "deposit", 100.0);
        int expectedID = 1;
        int actualID = transaction.getID();
        assertEquals(expectedID, actualID);
    }

    @Test
    public void testGetRecipientID() {
        Transaction transaction = new Transaction(1, 2, "transfer", 100.0);
        int expectedRecipientID = 2;
        int actualRecipientID = transaction.getRecipientID();
        assertEquals(expectedRecipientID, actualRecipientID);
    }

    @Test
    public void testGetType() {
        Transaction transaction = new Transaction(1, "deposit", 100.0);
        String expectedType = "deposit";
        String actualType = transaction.getType();
        assertEquals(expectedType, actualType);
    }

    @Test
    public void testGetAmount() {
        Transaction transaction = new Transaction(1, "deposit", 100.0);
        double expectedAmount = 100.0;
        double actualAmount = transaction.getAmount();
        assertEquals(expectedAmount, actualAmount, 0.0);
    }
    @Test
    public void testGetTransactionDate() {
        Transaction transaction = new Transaction(1, "deposit", 100.0);
        assertEquals("2023-05-24", transaction.getTransactionDate().toString());
    }

    @Test
    public void testSetID() {
        Transaction transaction = new Transaction(1,"deposit", 100.0);
        transaction.setID(2);
        int expectedID = 2;
        int actualID = transaction.getID();
        assertEquals(expectedID, actualID);
    }

    @Test
    public void testSetRecipientID() {
        Transaction transaction = new Transaction(1, "transfer", 100.0);
        transaction.setRecipientID(2);
        int expectedRecipientID = 2;
        int actualRecipientID = transaction.getRecipientID();
        assertEquals(expectedRecipientID, actualRecipientID);
    }

    @Test
    public void testSetType() {
        Transaction transaction = new Transaction(1, "deposit", 100.0);
        transaction.setType("withdrawal");
        String expectedType = "withdrawal";
        String actualType = transaction.getType();
        assertEquals(expectedType, actualType);
    }

    @Test
    public void testSetAmount() {
        Transaction transaction = new Transaction(1, "deposit", 100.0);
        transaction.setAmount(200.0);
        double expectedAmount = 200.0;
        double actualAmount = transaction.getAmount();
        assertEquals(expectedAmount, actualAmount, 0.0);
    }

}
