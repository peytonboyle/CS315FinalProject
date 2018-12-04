import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBTable extends DBQuery implements Insertable<Instance>
{
    public String name;
    public ArrayList<DBReference> references = new ArrayList();

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public DBTable(String name, DBConnection dbConnection)
    {
        super(dbConnection);
        this.name = name;

    }

    @Override
    public void insert( Instance instance) throws SQLException
    {
        Statement statement = dbConnection.getStatement();
        String sql = "INSERT INTO " + name + " VALUES "+instance.toString()+";";
        update(sql);
    }



}
