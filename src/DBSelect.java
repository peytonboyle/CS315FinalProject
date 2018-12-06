
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBSelect extends DBSQL
{
    public DBSelect( DBConnection dbConnection)
    {
        super(dbConnection);
    }

    public ResultSet getSelect(DBTable dbTable) throws SQLException
    {

        String sql = "Select * FROM " + dbTable.getName();

        return execute(sql);
    }
}

