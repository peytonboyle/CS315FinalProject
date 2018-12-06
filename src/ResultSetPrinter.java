import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSetPrinter
{
    private ResultSet rs;
    private ResultSetMetaData rsmd;

    public ResultSetPrinter(ResultSet rs) throws SQLException
    {
        this.rs = rs;
        rsmd = rs.getMetaData();
    };

    public String returnString() throws SQLException
    {
        String string = "";
        if( rs != null)
        {
            int columnNumber = rsmd.getColumnCount();
            while (rs.next())
            {
                for (int i = 1; i <= columnNumber; i++)
                {
                    String columnName = rsmd.getColumnName(i);
                    string +=rs.getString(columnName);
                    if( i != columnNumber)
                    {
                        string +=", ";
                    }
                }
                string +="\n";
            }
        }
        return string;
    }
}
