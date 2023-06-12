
package bank_management;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnect {
    static String url = "jdbc:mysql://localhost:3306/";
    static String user = "root";
    static String password = "";
    static Connection conn=null;
    public static java.sql.Connection dbconnection(){
        try{
            if(conn==null||conn.isClosed()){
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(url,user,password);
                return conn;
            }
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
}
