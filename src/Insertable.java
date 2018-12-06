import java.sql.SQLException;

public interface Insertable
{
    //Inserts code into Database
    void insert(Instance instance) throws SQLException;
}
