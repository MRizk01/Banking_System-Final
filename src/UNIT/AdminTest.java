package UNIT;

import Classes.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AdminTest {
    private Admin admin;
    @Before
    public void setUp() throws Exception {
        admin = new Admin("30120110105769", "admin", "admin", "01013944185");
        System.out.println("Beginning of AdminTest");
    }
    //test for admin login
    @Test
    public void testLogin() {
        assertTrue(admin.login("30120110105769", "admin"));
        assertFalse(admin.login("2060", "wrongPassword"));
        assertFalse(admin.login("1501", "admin"));
    }



    // Test for Admin.getID()
    @Test
    public void testGetID() {

        assertEquals("30120110105769", admin.getID());
    }

     //Test for Admin.getPassword()
    @Test
    public void testGetPassword() {
        assertEquals("admin", admin.getPassword());
    }
    //Test for Admin.getName()
    @Test
    public void testGetName() {
        assertEquals("admin", admin.getName());
    }
    //Test for Admin.getPhone()
    @Test
    public void testGetPhone() {
        assertEquals("01013944185", admin.getPhone());
    }


    // Test for Admin.createCustomer()
    @Test
    public void testCreateCustomerWithValidData() {
        // Create a new customer and add it to the list
        admin.createCustomer("2001", "123456",  "Egypt", "62117210607621", "Fname", "00000000000", "2000-10-19", "address");

        // Retrieve the updated customer and verify that the values were set correctly
        assertEquals(1, admin.getCustomerList().size());
        Customer createdCustomer = admin.searchCustomer("2001");
        assertNotNull(createdCustomer);
        assertNotNull(createdCustomer.getID());
        assertNotNull(createdCustomer.getNationality());
        assertNotNull(createdCustomer.getNationalID());
        assertNotNull(createdCustomer.getName());
        assertNotNull(createdCustomer.getPhone());
        assertNotNull(createdCustomer.getDataOfBirth());
        assertNotNull(createdCustomer.getAddress());
        assertNotNull(createdCustomer.getPassword());
        assertEquals("Fname", createdCustomer.getName());
        assertEquals( "123456",createdCustomer.getPassword() );
        assertEquals( "Egypt",createdCustomer.getNationality());
        assertEquals("00000000000", createdCustomer.getPhone());
        assertEquals("2000-10-19", createdCustomer.getDataOfBirth());
        assertEquals("address", createdCustomer.getAddress());
        assertEquals("2001", createdCustomer.getID());
    }
    @Test
    //test createCustomer with invalid data
    public void testCreateCustomerWithInvalidData(){
        // Create a new customer and add it to the list
        admin.createCustomer("1001", "123456",  "Egypt", "32117210607621", "Fname", "00000000000", "2000-10-19", "address");

        // Update the customer with disallowed data
        admin.updateCustomer("1001", "123456789",  "wrongNationality1234", "1", "wrongName1234", "11111111111", "2010-10-19", "newAddress");

        // Retrieve the updated customer and verify that the values were set correctly
        assertEquals(1, admin.getCustomerList().size());
        Customer createdCustomer = admin.searchCustomer("1001");
        assertNotNull(createdCustomer);
        assertNotNull(createdCustomer.getID());
        assertNotNull(createdCustomer.getNationality());
        assertNotNull(createdCustomer.getNationalID());
        assertNotNull(createdCustomer.getName());
        assertNotNull(createdCustomer.getPhone());
        assertNotNull(createdCustomer.getDataOfBirth());
        assertNotNull(createdCustomer.getAddress());
        assertNotNull(createdCustomer.getPassword());
        assertNotEquals("mohamed", createdCustomer.getName());
        assertNotEquals( "123456789",createdCustomer.getPassword() );
        assertNotEquals(  "wrongNationality1234", createdCustomer.getNationality());
        assertNotEquals("wrongName1234", createdCustomer.getName());
        assertNotEquals("11111111111", createdCustomer.getPhone());
        assertNotEquals("2010-10-19", createdCustomer.getDataOfBirth());
        assertNotEquals("newAddress", createdCustomer.getAddress());
        assertEquals("1001", createdCustomer.getID());
    }

    @Test
    public void testCreateCustomerWithBalance() {
        admin.createCustomerwithBalance(500,"1001", "123456",  "Egypt", "32117210607621", "Fname", "01013942182", "2000-10-19", "address");
        assertEquals(1, admin.getCustomerList().size());
    }
    //Test for Admin.updateCustomer()
    @Test
    public void testUpdateCustomerWithValidData() {
        // Create a new customer and add it to the list
        admin.createCustomer("2001", "123456",  "Egypt", "32117210607621", "Fname", "00000000000", "2000-10-19", "address");

        // Update the customer with disallowed data
        admin.updateCustomer("2001", "123456789",  "Egypt", "11234567891011", "mohamed", "11111111111", "2010-10-19", "newAddress");

        // Retrieve the updated customer and verify that the values were set correctly
        assertEquals(1, admin.getCustomerList().size());
        Customer updatedCustomer = admin.searchCustomer("2001");
        assertNotNull(updatedCustomer);
        assertNotNull(updatedCustomer.getID());
        assertNotNull(updatedCustomer.getNationality());
        assertNotNull(updatedCustomer.getNationalID());
        assertNotNull(updatedCustomer.getName());
        assertNotNull(updatedCustomer.getPhone());
        assertNotNull(updatedCustomer.getDataOfBirth());
        assertNotNull(updatedCustomer.getAddress());
        assertNotNull(updatedCustomer.getPassword());
        assertEquals("mohamed", updatedCustomer.getName());
        assertEquals( "123456789",updatedCustomer.getPassword() );
        assertEquals( "Egypt",updatedCustomer.getNationality());
        assertEquals("11111111111", updatedCustomer.getPhone());
        assertEquals("2010-10-19", updatedCustomer.getDataOfBirth());
        assertEquals("newAddress", updatedCustomer.getAddress());
        assertEquals("2001", updatedCustomer.getID());
    }

    //Test for Admin.updateCustomer()
    @Test
    public void testUpdateCustomerWithInvalidData() {
        // Create a new customer and add it to the list
        admin.createCustomer("1001", "123456",  "Egypt", "32117210607621", "Fname", "00000000000", "2000-10-19", "address");

        // Update the customer with disallowed data
        admin.updateCustomer("1001", "123456789",  "wrongNationality1234", "1", "wrongName1234", "11111111111", "2010-10-19", "newAddress");

        // Retrieve the updated customer and verify that the values were set correctly
        assertEquals(1, admin.getCustomerList().size());
        Customer updatedCustomer = admin.searchCustomer("1001");
        assertNotNull(updatedCustomer);
        assertNotNull(updatedCustomer.getID());
        assertNotNull(updatedCustomer.getNationality());
        assertNotNull(updatedCustomer.getNationalID());
        assertNotNull(updatedCustomer.getName());
        assertNotNull(updatedCustomer.getPhone());
        assertNotNull(updatedCustomer.getDataOfBirth());
        assertNotNull(updatedCustomer.getAddress());
        assertNotNull(updatedCustomer.getPassword());
        assertNotEquals("mohamed", updatedCustomer.getName());
        assertNotEquals( "123456789",updatedCustomer.getPassword() );
        assertNotEquals(  "wrongNationality1234", updatedCustomer.getNationality());
        assertNotEquals("wrongName1234", updatedCustomer.getName());
        assertNotEquals("11111111111", updatedCustomer.getPhone());
        assertNotEquals("2010-10-19", updatedCustomer.getDataOfBirth());
        assertNotEquals("newAddress", updatedCustomer.getAddress());
        assertEquals("1001", updatedCustomer.getID());
    }
    //Test for Admin.deleteCustomer()
    @Test
    public void testDeleteCustomer() {
        admin.createCustomer("1005", "123456789",  "1", "1", "1", "11111111111", "2010-10-19", "newAddress");
        admin.deleteCustomer("1005");
        assertNull(admin.searchCustomer("1005"));
        assertEquals(0, admin.getCustomerList().size());
    }
    @Test
    public void testDeleteNonExistentCustomer() {
        // Attempt to delete a customer that hasn't been created
        admin.deleteCustomer("9999");
        assertNull(admin.searchCustomer("9999"));
        assertEquals(0, admin.getCustomerList().size());
    }
    @Test
    public void testDeleteMultipleCustomers() {
        // Create multiple customers
        admin.createCustomer("1008", "123456789",  "Egypt", "11111117111111", "myName", "11111111111", "2010-10-19", "newAddress");
        admin.createCustomer("1009", "123456789",  "Egypt", "11111111112111", "myName", "11111111111", "2010-10-19", "newAddress");
        admin.createCustomer("1010", "123456789",  "Egypt", "11111111111411", "myName", "11111111111", "2010-10-19", "newAddress");

        // Delete two of the customers
        admin.deleteCustomer("1008");
        admin.deleteCustomer("1009");

        // Verify that the remaining customer is still in the system and that the customer list size is updated accordingly
        assertNotNull(admin.searchCustomer("1010"));
        assertEquals(1, admin.getCustomerList().size());
    }




    @Test
    public void testSearchCustomer() {
        admin.createCustomer("1001", "password",  "nationality", "12345678911121", "name", "01092927777", "2000-07-18", "address");
        assertEquals("1001", admin.searchCustomer("1001").getID());
    }








}
