package evaluation;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class CheckConnection {
    Connection conn = null;

    public static Connection ConnectDb() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/evaluation",
                    "loathingkernel",
                    "1234");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
