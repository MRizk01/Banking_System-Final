package Classes;
import Classes.Customer;
import bank_management.Dbconnect;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Admin {

    private static List<Customer> customers;

    // Attributes
    private int ID;
    private String password;
    private String name;
    private String phone;

    // Constructor
    public Admin(int ID, String password, String name, String phone) {
        this.ID = ID;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.customers = new ArrayList<>();

    }
    // Getters
    public int getID() {
        return ID;
    }
    public String getPassword() {
        return password;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }

    public List getCustomerList() {
        return customers;
    }


    //create new customer
    public void createCustomer(int CID, String Cpassword,String CaccountType, String Cnationality,int CnationalID,String Cname,String Cphone,String CdataOfBirth,String Caddress){
        //create new customer
        Customer customer = new Customer( CID,  Cpassword, CaccountType,   Cnationality, CnationalID, Cname, Cphone, CdataOfBirth, Caddress);
        //add customer to list
        customers.add(customer);
    }

    //delete customer
    public void deleteCustomer(int CID){
        //search for customer
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getID()==CID) {
                //remove customer from list
                customers.remove(i);
            }
        }
    }

    //update customer
    public void updateCustomer(int CID, String Cpassword,String CaccountType, String Cnationality,int CnationalID,String Cname,String Cphone,String CdataOfBirth,String Caddress){
        //search for customer
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getID()==CID) {
                //update customer
                customers.get(i).setPassword(Cpassword);
                customers.get(i).setAccountType(CaccountType);
                customers.get(i).setNationality(Cnationality);
                customers.get(i).setNationalID(CnationalID);
                customers.get(i).setName(Cname);
                customers.get(i).setPhone(Cphone);
                customers.get(i).setDataOfBirth(CdataOfBirth);
                customers.get(i).setAddress(Caddress);
            }
        }
    }

    //search for customer
    public static Customer searchCustomer(int CID){
        //search for customer
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getID()==CID) {
                //print customer data
                return customers.get(i);
            }
        }
        return null;
    }






}
