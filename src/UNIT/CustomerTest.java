package UNIT;
import Classes.*;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
public class CustomerTest {
    Admin admin;
    Customer customer;
    Customer recipient;

    @Before
    public void setUp() throws Exception {
        //create admin
        admin = new Admin("1234", "admin", "admin", "100100");
        admin.createCustomer("2001", "123456",  "USA", "32117210607621", "Fname", "00000000000", "2000-10-19", "address");
        customer = admin.searchCustomer("2001");
        admin.createCustomer("2002", "123456",  "USA", "32117210607621", "Fname", "00000000000", "2000-10-19", "address");

    }

    //test for withdraw
    @Test
    public void testWithdraw() {
        customer.setBalance(1000);
        customer.withdraw(500);
        assertEquals(500, customer.getBalance(), 0);
    }

    @Test
    public void testWithdrawGreaterThanBalance() {
        customer.setBalance(1000);
        customer.withdraw(1500);
        assertEquals(1000, customer.getBalance(), 0);
    }
    @Test
    public void testWithdrawNegative() {
        customer.setBalance(1000);
        customer.withdraw(-500);
        assertEquals(1000, customer.getBalance(), 0);
    }

    //test for deposit
    @Test
    public void testDeposit() {
        customer.setBalance(1000);
        customer.deposit(500);
        assertEquals(1500, customer.getBalance(), 0);
    }
    @Test
    public void testDepositNegative() {
        customer.setBalance(1000);
        customer.deposit(-500);
        assertEquals(1000, customer.getBalance(), 0);
    }

    //test for transfer
    @Test
    public void testTransfer() {
        customer.setBalance(1000);
        customer.transfer(500, "2002");
        assertEquals(500, admin.searchCustomer("2002").getBalance(), 0);
    }
    @Test
    public void testTransferToInvalidCustomer() {
        customer.setBalance(1000);
        customer.transfer(500, "9999");
        assertEquals(1000, customer.getBalance(), 0);
        assertNull(admin.searchCustomer("9999"));
    }

    //test for getBalance
    @Test
    public void testGetBalance() {
        customer.setBalance(1000);
        assertEquals(1000, customer.getBalance(), 0);
    }
    //test for setBalance
    @Test
    public void testSetBalance() {
        customer.setBalance(1000);
        assertEquals(1000, customer.getBalance(), 0);
    }
    //test for getID
    @Test
    public void testGetID() {
        assertEquals("2001", customer.getID());
    }

    //test for getPassword
    @Test
    public void testGetPassword() {
        assertEquals("123456", customer.getPassword());
    }
    //test for getNationality
    @Test
    public void testGetNationality() {
        assertEquals("USA", customer.getNationality());
    }
    //test for getNationalID
    @Test
    public void testGetNationalID() {
        assertEquals("32117210607621", customer.getNationalID());
    }
    //test for getName
    @Test
    public void testGetName() {
        assertEquals("Fname", customer.getName());
    }
    //test for getPhone
    @Test
    public void testGetPhone() {
        assertEquals("00000000000", customer.getPhone());
    }
    //test for DateOfBirth
    @Test
    public void testGetDateOfBirth() {
        assertEquals("2000-10-19", customer.getDateOfBirth());
    }

    //test for getAddress
    @Test
    public void testGetAddress() {
        assertEquals("address", customer.getAddress());
    }
    //test getJoinDate
    @Test
    public void testGetJoinDate() {
        assertEquals("2023-06-10", customer.getJoinDate());
    }


    //test for setID
    @Test
    public void testSetID() {
        customer.setID("2004");
        assertEquals("2004", customer.getID());
    }
    //test for setPassword
    @Test
    public void testSetPassword() {
        customer.setPassword("newPass");
        assertEquals("newPass", customer.getPassword());
    }
    //test for setNationality
    @Test
    public void testSetNationality() {
        customer.setNationality("Canada");
        assertEquals("Canada", customer.getNationality());
    }
    //test for setNationalID
    @Test
    public void testSetNationalID() {
        customer.setNationalID("987654321");
        assertEquals("987654321", customer.getNationalID());
    }
    //test for setName
    @Test
    public void testSetName() {
        customer.setName("Jane Doe");
        assertEquals("Jane Doe", customer.getName());
    }
    //test for setPhone
    @Test
    public void testSetPhone() {
        customer.setPhone("555-4321");
        assertEquals("555-4321", customer.getPhone());
    }

    //test for setAddress
    @Test
    public void testSetAddress() {
        customer.setAddress("456 Main St.");
        assertEquals("456 Main St.", customer.getAddress());
    }

    @Test
    public void testViewAccountDetails() {
        // create a new customer object and set its attributes
        Customer customer = new Customer("2003", "password", "Egypt", "12345678910112", "Alice Smith", "01124855375", "1990-01-01", "123 Main St");
        customer.setBalance(1000);

        // call the viewAccountDetails() method and capture the output in a string
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        customer.viewAccountDetails();
        String output = outContent.toString().trim();

        // assert that the output contains the expected values
        assertTrue(output.contains("Account details for Alice Smith"));
        assertTrue(output.contains("ID: 2003"));
        assertTrue(output.contains("Join Date: "));
        assertTrue(output.contains("Nationality: Egypt"));
        assertTrue(output.contains("National ID: 12345678910112"));
        assertTrue(output.contains("Phone: 01124855375"));
        assertTrue(output.contains("Date of Birth: 1990-01-01"));
        assertTrue(output.contains("Address: 123 Main St"));
        assertTrue(output.contains("Balance: 1000.0"));
    }


    @Test
    public void testGetTransactionHistory() {
        customer.deposit(100.0);
        customer.withdraw(50.0);
        customer.transfer(25.0, "2002");
        List<Transaction> transactionHistory = customer.getTransactionHistory();
        assertEquals(3, transactionHistory.size());
        assertEquals("deposit", transactionHistory.get(0).getType());
        assertEquals(100.0, transactionHistory.get(0).getAmount(), 0);
        assertEquals(50.0, transactionHistory.get(1).getAmount(), 0);
        assertEquals(25.0, transactionHistory.get(2).getAmount(), 0);
        assertEquals("withdraw", transactionHistory.get(1).getType());
        assertEquals("transfer", transactionHistory.get(2).getType());
    }







}
