package airlinesmanagementsystem;
import java.sql.*;

class ConnectionClass {

    ConnectionClass() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ams", "root", "admin");

            Statement st = con.createStatement();
            String query = "select * from login";
            ResultSet rs = st.executeQuery(query);
//            while (rs.next()) {
//                System.out.println(rs.getString("username"));
//            }

            con.close();

        } catch (Exception e) {

        }
    }

    public static void main(String args[]) {
        new ConnectionClass();
    }
}
