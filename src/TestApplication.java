import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class TestApplication
{
    //String that connect to database
    private static final String connectString = "jdbc:mysql://cs.neiu.edu:3306/18f315_Daniel?" +
            "user=USERNAME&password=PASSWORD&autoReconnect=true&useSSL=false";

    public static void main( String args[])
    {
        /*
        User user = createUser();

        */

        User user = new User( "18f315_Daniel","!Aaa10706140696");

        DBConnection dbConnection = new DBConnection(user, connectString);

        //Connects to Database
        try
        {
            dbConnection.connect();
            System.out.println("Successfully connected");
        }
        catch (SQLException ex)
        {
            System.out.println( "Invalid Login");
            System.exit(1);
        }

        DBTable patients = new DBTable("Patient", dbConnection);
        DBTable doctors = new DBTable("Doctor", dbConnection);
        ResultSet rs = null;
        ResultSetMetaData rsmd = null;
        try
        {
            DBJoin dbJoin = new DBJoin(dbConnection);
            DBReference dbReference = new DBReference(patients, doctors, "primaryDoctorID","doctorID");
            rs = dbJoin.getJoin(dbReference );
            rsmd = rs.getMetaData();
            System.out.println("Successfully joined.");
            if( rs != null)
            {
                int columnNumber = rsmd.getColumnCount();
                while (rs.next())
                {
                    for (int i = 1; i <= columnNumber; i++)
                    {
                        String columnName = rsmd.getColumnName(i);
                        System.out.print(rs.getString(columnName));
                        if( i != columnNumber)
                        {
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                }
            }

        }
        catch (SQLException ex)
        {
            System.out.println("Failed join.");
            System.exit(1);
        }


    }

    //Creates a user
    public static User createUser()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username:");
        String username = scanner.next();
        System.out.print("Enter password:");
        String password = scanner.next();

        User user = new User(username, password);

        return user;
    }

}
