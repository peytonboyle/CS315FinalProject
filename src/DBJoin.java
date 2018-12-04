import java.sql.ResultSet;
import java.sql.SQLException;

public class DBJoin extends DBQuery
{

    public DBJoin( DBConnection dbConnection)
    {
        super(dbConnection);
    }

    public ResultSet getJoin(DBReference dbReference) throws SQLException
    {
        Tuple tables = dbReference.getTables();
        DBTable dbTable1 = (DBTable)tables.x;
        DBTable dbTable2 = (DBTable)tables.y;

        Tuple keys = dbReference.getKeys();
        String key1 = (String)keys.x;
        String key2 = (String)keys.y;

        String sql = "Select * FROM " + dbTable1.getName() + " JOIN " + dbTable2.getName() +
                " WHERE " + dbTable1.getName() +"."+key1 + " = " + dbTable2.getName()+"."+ key2;

         return execute(sql);
    }

    public ResultSet getLeftJoin(DBReference dbReference) throws SQLException
    {
        Tuple tables = dbReference.getTables();
        DBTable dbTable1 = (DBTable)tables.x;
        DBTable dbTable2 = (DBTable)tables.y;

        Tuple keys = dbReference.getKeys();
        String key1 = (String)keys.x;
        String key2 = (String)keys.y;

        String sql = "Select * FROM " + dbTable1.getName() + " LEFT JOIN " + dbTable2.getName() +
                " ON " + dbTable1.getName() +"."+key1 + " = " + dbTable2.getName()+"."+ key2;

        return execute(sql);
    }

    public ResultSet getRightJoin(DBReference dbReference) throws SQLException
    {
        Tuple tables = dbReference.getTables();
        DBTable dbTable1 = (DBTable)tables.x;
        DBTable dbTable2 = (DBTable)tables.y;

        Tuple keys = dbReference.getKeys();
        String key1 = (String)keys.x;
        String key2 = (String)keys.y;

        String sql = "Select * FROM " + dbTable1.getName() + " RIGHT JOIN " + dbTable2.getName() +
                " ON " + dbTable1.getName() +"."+key1 + " = " + dbTable2.getName()+"."+ key2;

        return execute(sql);
    }
}
