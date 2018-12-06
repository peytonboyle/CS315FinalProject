import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DBSQL
{
    private DBConnection dbConnection;
    public Statement statement;

    public DBSQL(DBConnection dbConnection)
    {
        this.dbConnection = dbConnection;
    }

    public void update(String sql) throws SQLException
    {
        dbConnection.connect();
        Statement statement = dbConnection.getStatement();
        statement.executeUpdate(sql);
    };

    public ResultSet execute(String sql) throws SQLException
    {
        dbConnection.connect();
        Statement statement = dbConnection.getStatement();
        return statement.executeQuery(sql);
    };
}
