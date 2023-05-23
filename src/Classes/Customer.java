package Classes;

import java.time.LocalDate;

public class Customer {

    //attributes
    private double balance;
    private int ID;
    private String password;
    private String accountType;

    private LocalDate joinDate;
    private String nationality;
    private int nationalID;
    private String name;
    private String phone;
    private String dataOfBirth;
    private String address;

    //constructor




    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setNationalID(int nationalID) {
        this.nationalID = nationalID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDataOfBirth(String dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public int getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }

    public String getAccountType() {
        return accountType;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public String getNationality() {
        return nationality;
    }

    public int getNationalID() {
        return nationalID;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public String getAddress() {
        return address;
    }
    public Customer(int ID, String password, String accountType, String nationality, int nationalID, String name, String phone, String dataOfBirth, String address) {
        this.balance=0;
        this.ID = ID;
        this.password = password;
        this.accountType = accountType;
        this.joinDate = LocalDate.now();
        this.nationality=nationality;
        this.nationalID=nationalID;
        this.name=name;
        this.phone=phone;
        this.dataOfBirth=dataOfBirth;
        this.address=address;

    }
    public Customer(double balance,int ID, String password, String accountType, String nationality, int nationalID, String name, String phone, String dataOfBirth, String address) {
        this.balance=balance;
        joinDate = LocalDate.now();
        this.ID = ID;
        this.password = password;
        this.accountType = accountType;
        this.joinDate = joinDate;
        this.nationality=nationality;
        this.nationalID=nationalID;
        this.name=name;
        this.phone=phone;
        this.dataOfBirth=dataOfBirth;
        this.address=address;

    }

    //withdraw
    public void withdraw(double amount){
       Transaction transaction1 = createTransaction(this.ID,"withdraw", amount);

        this.balance-=amount;
    }
    //deposit
    public void deposit(double amount){
        Transaction transaction2 = createTransaction(this.ID,"deposit", amount);
        this.balance+=amount;
    }
    //transfer
    public void transfer(double amount,int CId){
        this.balance-=amount;
        Admin.searchCustomer(CId).deposit(amount);
        Transaction transaction3 = createTransaction(this.ID,CId,"transfer", amount);
    }

    //create new transaction
    public Transaction createTransaction(int ID, int toID, String type, double amount){
        //create new transaction
        return new Transaction( ID, toID, type, amount);
        //add transaction to list
//        transactions.add(transaction);
    }
    public Transaction createTransaction(int ID, String type,  double amount){
        //create new transaction
        return new Transaction( ID, type, amount);
        //add transaction to list
//        transactions.add(transaction);

    }


}
