package CarWantDB;
import java.sql.*;

/**
 * Created by semashko on 7/21/2015.
 */
public class DataBase{

    public void connect (String registrationEmail) {
    //Initialize the DB connection
        try {
            String URL = "jdbc:mysql://rabbit.devplatform1.com/carwant";
            String USER = "";
            String PASS = "";
            Class.forName("org.jdbc.mysql.Driver");
            Connection conn = DriverManager.getConnection(URL, USER, PASS);

            // SQL statement
            Statement stmt = conn.createStatement();
            int rs1 = stmt.executeUpdate("UPDATE `carwant`.`User`SET`status`='1' WHERE email = " + registrationEmail   );

            //ResultSet rs = stmt.executeQuery("SELECT email,status FROM User WHERE email = 'f480954@trbvm.com'");
            // Print the results
            /*while (rs.next()) {
                System.out.println(rs.getRow() + ". " + rs.getString("email") + "\t" + rs.getInt("status"));
            }*/
            // Close connection
            stmt.close();
        }
            catch(Exception e){
                System.err.println("Got an exception! ");
                System.err.println(e.getMessage());
            }
        }
    }



