package Classes;
import Classes.Customer;
import bank_management.Dbconnect;

import java.sql.SQLException;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Admin {

    public static List<Customer> customers;

    // Attributes
    private String ID;
    private String password;
    private String name;
    private String phone;

    //admin login
    public boolean login(String ID, String password){
        if (this.getID().equals(ID)) {
            //check password
            if (this.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    // Constructor
    public Admin(String ID, String password, String name, String phone) {
        this.ID = ID;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.customers = new ArrayList<>();

    }
    // Getters
    public String getID() {
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


    //create customer
    public void createCustomer(String CID, String Cpassword, String Cnationality,String CnationalID,String Cname,String Cphone,String CdataOfBirth,String Caddress){
        /////////////
        int index;
        String errorset = "";
        boolean isDataValid = true;


        if (Cpassword == null || Cpassword.isEmpty()) {
            errorset += "Password should not be empty!\n";
            isDataValid = false;

        } else if (Cpassword.length() < 6) {
            errorset += "Password length should be more than or equal 6!\n";
            isDataValid = false;
        }

        //name
        if (Cname == null || Cname.isEmpty()) {
            errorset += "Name should not be empty!\n";
            isDataValid = false;
        }
        else if (Cname.matches("^[a-zA-Z\\s]+$")) {
            if (Cname.length() < 4) {
                errorset += "Name should be grater than 3 letter!";
                isDataValid = false;
            }
        }
        else if (!Cname.matches("^[a-zA-Z\\s]+$")) {
            errorset += "Name is  invalid!";
            isDataValid = false;
        }

        if (CdataOfBirth == null || CdataOfBirth.isEmpty()) {
            errorset += "Date of Birth should not be empty! format (yyyy-mm-day)\n";
            isDataValid = false;
        } else if (!CdataOfBirth.matches("^(\\d{4})-(\\d{1,2})-(\\d{1,2})$")) {
            errorset += "Invalid Date of Birth ! format (yyyy-mm-day)\n";
            isDataValid = false;
        }

        if (Cphone == null || Cphone.isEmpty()) {
            errorset += "Phone Number should not be empty!\n";
            isDataValid = false;
        } else if (!Cphone.matches("^(?:\\+20|01)?\\d{11}$")) {
            errorset += "Phone Number is not valid!\n";
            isDataValid = false;
        }

        if (Cnationality == null || Cnationality.isEmpty()) {
            errorset += "Nationality should not be empty!\n";
            isDataValid = false;
        } else if (!Cnationality.matches("^[a-zA-Z\\s]+$")) {
            errorset += "Nnationality is not valid!\n";
            isDataValid = false;
        }


        if (Caddress == null || Caddress.isEmpty()) {
            errorset += "Address should not be empty!\n";
            isDataValid = false;
        } else if (Caddress.matches("^[a-zA-Z\\s]+$")) {
            if (Caddress.length() < 4) {
                errorset += "Address should be grater than 3 letter!\n";
                isDataValid = false;
            }

        } else if (!Caddress.matches("^[a-zA-Z\\s]+$")) {
            errorset += "Address is  invalid!\n";
            isDataValid = false;
        }


        if (!CnationalID.matches("^\\d{14}$")) {
            errorset += "national ID is  invalid!\n";
            isDataValid = false;
        }

        if (isDataValid == true) {
            Customer customer = new Customer(CID, Cpassword, Cnationality, CnationalID, Cname, Cphone, CdataOfBirth, Caddress);
            //add customer to list
            customers.add(customer);
        } else {
            System.out.println(errorset);
        }
        //////////////




    }
    public void createCustomerwithBalance(double Cbalance,String CID, String Cpassword, String Cnationality,String CnationalID,String Cname,String Cphone,String CdataOfBirth,String Caddress){
        int index;
        String errorset = "";
        boolean isDataValid = true;


        if (Cbalance < 0) {
            errorset += "Balance should not be negative!\n";
            isDataValid = false;
        }

        if (Cpassword == null || Cpassword.isEmpty()) {
            errorset += "Password should not be empty!\n";

            isDataValid = false;
        } else if (Cpassword.length() < 6) {
            errorset += "Password length should be more than or equal 6!\n";
            isDataValid = false;
        }

        //name
        if (Cname == null || Cname.isEmpty()) {
            errorset += "Name should not be empty!\n";
            isDataValid = false;
        }
        else if (Cname.matches("^[a-zA-Z\\s]+$")) {
            if (Cname.length() < 4) {
                errorset += "Name should be grater than 3 letter!\n";
                isDataValid = false;
            }
        }
        else if (!Cname.matches("^[a-zA-Z\\s]+$")) {
            errorset += "Name is  invalid!\n";
            isDataValid = false;
        }

        if (CdataOfBirth == null || CdataOfBirth.isEmpty()) {
            errorset += "Date of Birth should not be empty! format (yyyy-mm-day)\n";
            isDataValid = false;
        } else if (!CdataOfBirth.matches("^(\\d{4})-(\\d{1,2})-(\\d{1,2})$")) {
            errorset += "Invalid Date of Birth ! format (yyyy-mm-day)\n";
            isDataValid = false;
        }

        if (Cphone == null || Cphone.isEmpty()) {
            errorset += "Phone Number should not be empty!\n";
            isDataValid = false;
        } else if (!Cphone.matches("^(?:\\+20|01)?\\d{11}$")) {
            errorset += "Phone Number is not valid!\n";
            isDataValid = false;
        }

        if (Cnationality == null || Cnationality.isEmpty()) {
            errorset += "Nationality should not be empty!\n";
            isDataValid = false;
        } else if (!Cnationality.matches("^[a-zA-Z\\s]+$")) {
            errorset += "Nnationality is not valid!\n";
            isDataValid = false;
        }


        if (Caddress == null || Caddress.isEmpty()) {
            errorset += "Address should not be empty!\n";
            isDataValid = false;
        } else if (Caddress.matches("^[a-zA-Z\\s]+$")) {
            if (Caddress.length() < 4) {
                errorset += "Address should be grater than 3 letter!\n";
                isDataValid = false;
            }

        } else if (!Caddress.matches("^[a-zA-Z\\s]+$")) {
            errorset += "Address is  invalid!\n";
            isDataValid = false;
        }


        if (!CnationalID.matches("^\\d{14}$")) {
            errorset += "national ID is  invalid!\n";
            isDataValid = false;
        }

        if (isDataValid == true) {
            //create customer
            Customer customer = new Customer(Cbalance,CID, Cpassword, Cnationality, CnationalID, Cname, Cphone, CdataOfBirth, Caddress);
            //add customer to list
            customers.add(customer);
        } else {
            System.out.println(errorset);
        }

    }

    //delete customer
    public void deleteCustomer(String CID){
        //search for customer
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getID().equals(CID) ) {
                //remove customer from list
                customers.remove(i);
            }
        }
    }

    //update customer
    public void updateCustomer(String CID, String Cpassword, String Cnationality,String CnationalID,String Cname,String Cphone,String CdataOfBirth,String Caddress) {
        int index;
        String errorset = "";
        boolean isDataValid = false;

        for (index = 0; index < customers.size(); index++) {
            if (customers.get(index).getID() == CID) {
                isDataValid = true;
                break;
            }
        }

        if (Cpassword == null || Cpassword.isEmpty()) {
            errorset += "Password should not be empty!\n";

            isDataValid = false;
        } else if (Cpassword.length() < 6) {
            errorset += "Password length should be more than or equal 6!\n";
            isDataValid = false;
        }


        //name
        if (Cname == null || Cname.isEmpty()) {
            errorset += "Name should not be empty!\n";
            isDataValid = false;
        }
        else if (Cname.matches("^[a-zA-Z\\s]+$")) {
            if (Cname.length() < 4) {
                errorset += "Name should be grater than 3 letter!\n";
                isDataValid = false;
            }
        }
         else if (!Cname.matches("^[a-zA-Z\\s]+$")) {
            errorset += "Name is  invalid!\n";
            isDataValid = false;
        }

        if (CdataOfBirth == null || CdataOfBirth.isEmpty()) {
            errorset += "Date of Birth should not be empty! format (yyyy-mm-day)\n";
            isDataValid = false;
        } else if (!CdataOfBirth.matches("^(\\d{4})-(\\d{1,2})-(\\d{1,2})$")) {
            errorset += "Invalid Date of Birth ! format (yyyy-mm-day)\n";
            isDataValid = false;
        }

        if (Cphone == null || Cphone.isEmpty()) {
            errorset += "Phone Number should not be empty!\n";
            isDataValid = false;
        } else if (!Cphone.matches("^(?:\\+20|01)?\\d{11}$")) {
            errorset += "Phone Number is not valid!\n";
            isDataValid = false;
        }

        if (Cnationality == null || Cnationality.isEmpty()) {
            errorset += "Nationality should not be empty!\n";
            isDataValid = false;
        } else if (!Cnationality.matches("^[a-zA-Z\\s]+$")) {
            errorset += "Nnationality is not valid!\n";
            isDataValid = false;
        }


        if (Caddress == null || Caddress.isEmpty()) {
            errorset += "Address should not be empty!\n";
            isDataValid = false;
        } else if (Caddress.matches("^[a-zA-Z\\s]+$")) {
            if (Caddress.length() < 4) {
                errorset += "Address should be grater than 3 letter!\n";
                isDataValid = false;
            }

        } else if (!Caddress.matches("^[a-zA-Z\\s]+$")) {
            errorset += "Address is  invalid!\n";
            isDataValid = false;
        }


        if (!CnationalID.matches("^\\d{14}$")) {
            errorset += "national ID is  invalid!\n";
            isDataValid = false;
        }

        if (isDataValid == true) {
            //update customer
            customers.get(index).setPassword(Cpassword);
            customers.get(index).setNationality(Cnationality);
            customers.get(index).setNationalID(CnationalID);
            customers.get(index).setName(Cname);
            customers.get(index).setPhone(Cphone);
            customers.get(index).setDataOfBirth(CdataOfBirth);
            customers.get(index).setAddress(Caddress);
        } else {
            System.out.println(errorset);
        }
    }







    //search for customer
    public static Customer searchCustomer(String CID){
        //search for customer
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getID().equals(CID) ) {
                //print customer data
                return customers.get(i);
            }
        }
        return null;
    }








}
