package Classes;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;

public class Transaction {


    //attributes
    private String recipientID;
    private String ID;
    private String type;
    private String date;
    private double amount;

    //constructor
    public Transaction(String ID, String type, double amount) {
        this.ID = ID;
        this.type = type;
        this.date = LocalDate.now().toString();
        this.amount = amount;
    }

    public Transaction(String ID, String recipientID, String type, double amount) {
        this.ID = ID;
        this.recipientID = recipientID;
        this.type = type;
        this.date = LocalDate.now().toString();
        this.amount = amount;
    }

    //getters
    public String getID() {
        return ID;
    }

    public String getRecipientID() {
        return recipientID;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionDate() {
        return date;
    }


    public boolean isDeposit() {
        return type.equals("deposit");
    }
    public boolean isTransfer() {
        return type.equals("transfer");
    }








}
