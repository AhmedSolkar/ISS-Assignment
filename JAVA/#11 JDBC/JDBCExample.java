
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

    public static void main(String[] args) {

    
        try (Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:orcl", "scott", "TIGER")) {

            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }
			Statement stmt = conn.createStatement();
			String query = "CREATE TABLE EMPTABLE ("
							  +"empno    NUMBER(4,0),"
							  +"empname    VARCHAR2(10),"
							  +"sal      NUMBER(7,2),"
							  +"CONSTRAINT pkey PRIMARY KEY (empno))";

			stmt.execute(query);
			conn.close();
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
