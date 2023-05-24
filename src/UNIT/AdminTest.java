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
        admin = new Admin(1000, "admin", "admin", "100100");
        System.out.println("Beginning of AdminTest");
    }
    //test for admin login
    @Test
    public void testLogin() {
        assertTrue(admin.login(1000, "admin"));
        assertFalse(admin.login(2000, "wrongPassword"));
        assertFalse(admin.login(1501, "admin"));
    }



    // Test for Admin.getID()
    @Test
    public void testGetID() {

        assertEquals(1000, admin.getID());
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
        assertEquals("100100", admin.getPhone());
    }


    // Test for Admin.createCustomer()
    @Test
    public void testCreateCustomer() {
        admin.createCustomer(1001, "password",  "nationality", 123456789, "name", "phone", "dateOfBirth", "address");
        assertEquals(1, admin.getCustomerList().size());
    }


    //Test for Admin.updateCustomer()
    @Test
    public void testUpdateCustomer() {
        // Create a new customer and add it to the list
        admin.createCustomer(1001, "password",  "nationality", 123456789, "name", "phone", "dateOfBirth", "address");

        // Update the customer with new values
        admin.updateCustomer(1001, "newPassword",  "newNationality", 987654321, "newName", "newPhone", "newDateOfBirth", "newAddress");

        // Retrieve the updated customer and verify that the values were set correctly
        Customer updatedCustomer = admin.searchCustomer(1001);
        assertEquals("newPassword", updatedCustomer.getPassword());
//        assertEquals("newAccountType", updatedCustomer.getAccountType());
        assertEquals("Nationality should be updated.", updatedCustomer.getNationality(), "newNationality");
        assertEquals(987654321, updatedCustomer.getNationalID());
        assertEquals("newName", updatedCustomer.getName());
        assertEquals("newPhone", updatedCustomer.getPhone());
        assertEquals("newDateOfBirth", updatedCustomer.getDataOfBirth());
        assertEquals("newAddress", updatedCustomer.getAddress());
        admin.updateCustomer(1000, "new", "Customer",  100, "newC", "101010", "admin", "newAddress");
        assertEquals(1000, admin.getID());
    }
    //Test for Admin.deleteCustomer()
    @Test
    public void testDeleteCustomer() {
        admin.createCustomer(1001, "password",  "nationality", 123456789, "name", "phone", "dateOfBirth", "address");
        admin.deleteCustomer(1001);
        assertNull(admin.searchCustomer(1001));
        assertEquals(0, admin.getCustomerList().size());
    }


    @Test
    public void testSearchCustomer() {
        admin.createCustomer(1001, "password",  "nationality", 123456789, "name", "phone", "dateOfBirth", "address");
        assertEquals(1001, admin.searchCustomer(1001).getID());
    }








}
