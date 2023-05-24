package UNIT;
import Classes.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
public class CustomerTest {
    Admin admin;
    Customer customer;

    @Before
    public void setUp() throws Exception {
        //create admin
        admin = new Admin(1234, "admin", "admin", "100100");
        admin.createCustomer(11111, "pass", "USA", 123456789, "aaaa", "555-1234", "1990-01-01", "123 Main St.");
        customer = admin.searchCustomer(11111);
        admin.createCustomer(2222, "pass", "USA", 123456789, "John", "555-1234", "1990-01-01", "123 Main St.");

    }

    //test for withdraw
    @Test
    public void testWithdraw() {
        customer.setBalance(1000);
        customer.withdraw(500);
        assertEquals(500, customer.getBalance(), 0);
    }

    //test for deposit
    @Test
    public void testDeposit() {
        customer.setBalance(1000);
        customer.deposit(500);
        assertEquals(1500, customer.getBalance(), 0);
    }
    //test for transfer
    @Test
    public void testTransfer() {
        customer.setBalance(1000);
        customer.transfer(500, 2222);
        assertEquals(500, admin.searchCustomer(2222).getBalance(), 0);
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
        assertEquals(11111, customer.getID());
    }

    //test for getPassword
    @Test
    public void testGetPassword() {
        assertEquals("pass", customer.getPassword());
    }
    //test for getNationality
    @Test
    public void testGetNationality() {
        assertEquals("USA", customer.getNationality());
    }
    //test for getNationalID
    @Test
    public void testGetNationalID() {
        assertEquals(123456789, customer.getNationalID());
    }
    //test for getName
    @Test
    public void testGetName() {
        assertEquals("aaaa", customer.getName());
    }
    //test for getPhone
    @Test
    public void testGetPhone() {
        assertEquals("555-1234", customer.getPhone());
    }
    //test for getDateOfBirth
    @Test
    public void testGetDateOfBirth() {
        assertEquals("1990-01-01", customer.getDateOfBirth());
    }
    //test for getAddress
    @Test
    public void testGetAddress() {
        assertEquals("123 Main St.", customer.getAddress());
    }
    //test getJoinDate
    @Test
    public void testGetJoinDate() {
        assertEquals("2023-05-24", customer.getJoinDate().toString());
    }


    //test for setID
    @Test
    public void testSetID() {
        customer.setID(2);
        assertEquals(2, customer.getID());
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
        customer.setNationalID(987654321);
        assertEquals(987654321, customer.getNationalID());
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







}
