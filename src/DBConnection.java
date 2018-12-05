import java.sql.*;

public class DBConnection
{
    User user;
    String host;
    Statement statement;
    Connection connection = null;

    //Creates a connection to the database using the info of the user
    public DBConnection(User user, String host)
    {
        this.user = user;
        this.host = host;

        this.host = this.host.replaceFirst("USERNAME", user.getUsername());
        this.host = this.host.replaceFirst("PASSWORD", user.getPassword());
    }

    public void connect() throws SQLException
    {
        connection = DriverManager.getConnection(host);
        statement = connection.createStatement();
    }

    public Statement getStatement()
    {
        return statement;
    } //peyton
}
