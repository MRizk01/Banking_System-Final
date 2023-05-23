package Classes;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;

public class Transaction {


        //attributes
        private int toID;
        private int ID;
        private String type;
        private LocalDate date;
        private double amount;

        //constructor
        public Transaction(int ID, String type,  double amount) {
            this.ID = ID;
            this.type = type;
            this.date = LocalDate.now();
            this.amount = amount;
        }
    public Transaction(int ID, int toID, String type,  double amount) {
        this.ID = ID;
        this.toID = toID;
        this.type = type;
        this.date = LocalDate.now();
        this.amount = amount;
    }
        //getters
        public int getID() {
            return ID;
        }
    public int getToID() {
        return toID;
    }

        public String getType() {
            return type;
        }



        public double getAmount() {
            return amount;
        }


        //setters
        public void setID(int ID) {
            this.ID = ID;
        }
    public void setToID(int toID) {
        this.toID=toID;
    }
    public void setType(String type) {
            this.type = type;
        }



        public void setAmount(double amount) {
            this.amount = amount;
        }

}