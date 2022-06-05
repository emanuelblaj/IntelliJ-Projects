import java.sql.*;

public class JdbcTest {

    public static void main(String[] args) throws SQLException {

        Connection myConn= null;
        Statement myStmt = null;
        ResultSet myRs = null;

        String dbUrl = "jdbc:mysql://localhost:3306/demo";
        String user = "student";
        String pass = "student";

        try {
//            1. Get a connection to database
            myConn  = DriverManager.getConnection(dbUrl, user, pass);

//            2. Create a statement
            myStmt = myConn.createStatement();

//            3.Insert a new employee
            System.out.println("Inserting a new employee to database.\n");
            int rowsAffected = myStmt.executeUpdate(
                    "insert into employees " +
                            "(last_name, first_name, email, department, salary) " +
                            "values " +
                            "('Wright', 'Eric', 'eric.wirght@foo.com', 'HR', '33000.00')");

//            4. Execute SQL query
            myRs = myStmt.executeQuery("select * from employees");

//            5. Process the result set
            while (myRs.next()){
                System.out.println(myRs.getString("id") + " ," + myRs.getString("last_name") + " , " + myRs.getString("first_name") + " , "
                        + myRs.getString("email") + " , " + myRs.getString("department") + " , " + myRs.getString("salary"));
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        finally {
            if(myRs != null) {
                myRs.close();
            }

            if(myStmt != null) {
                myStmt.close();
            }
            if (myConn != null) {
                myConn.close();
            }
        }
    }
}
