package Practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
1. Register the Driver class
2. Create connection
3. Create statement
4. Execute queries
5. Close connection
 */
public class JavaJDBC {
    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/hr";
        String userName = "root";
        String password = "admin";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbURL,userName,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employees where last_name like 'S%'");
            while (resultSet.next()) {
                int employeeID = resultSet.getInt("EMPLOYEE_ID");
                String firstName = resultSet.getString("FIRST_NAME");
                String lastName = resultSet.getString("LAST_NAME");
                System.out.println(employeeID+"  "+firstName+"  "+lastName);
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
